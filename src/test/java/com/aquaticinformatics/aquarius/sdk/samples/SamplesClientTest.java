package com.aquaticinformatics.aquarius.sdk.samples;

import com.aquaticinformatics.aquarius.sdk.AquariusServerVersion;
import com.aquaticinformatics.aquarius.sdk.helpers.ContentPart;
import com.aquaticinformatics.aquarius.sdk.timeseries.AquariusClient;
import com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Acquisition;
import com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import net.servicestack.client.MimeTypes;
import net.servicestack.func.Func;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.crypto.Cipher;
import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.StringReader;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SamplesClientTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void Create_Works() {

        try {
            FooAqts();

            SamplesClient client = SamplesClient.createConnectedClient("https://test.gaiaserve.net", "28aa0892c15a5629cc94af807d33679a");

            System.out.printf("Connected to %s (%s)\n", client.Api.getEndpointUrl(), client.ServerVersion.toString());
            
            if (false) {
                ServiceModel.SearchResultUser searchResultUser = client.Api.get(new ServiceModel.GetUsers());
            }

            if (false) {
                ServiceModel.AttachmentRepresentation attachmentRepresentation = client.postFileWithRequest(
                        new File("C:\\Users\\Doug.Schmidt\\Downloads\\F4xxx Sample Scattergraphs.pdf"),
                        new ServiceModel.PostUploadAttachment());
            }

            if (false) {
                ServiceModel.TaxonImportSummary taxonImportSummary = client.postFileWithRequest(
                        new File("C:\\Users\\Doug.Schmidt\\Downloads\\taxon_csv_import_example.csv"),
                        new ServiceModel.PostImportTaxonsDryRun());
            }

            if (true) {
                ServiceModel.SearchResultLabReport searchResultLabReport = client.Api.get(new ServiceModel.GetLabReports());

                ServiceModel.LabReport labReport = Func.first(searchResultLabReport.DomainObjects);
                ServiceModel.ObservationImportSummary sedd = client.postFileWithRequest(
                        new File("C:\\Users\\Doug.Schmidt\\Downloads\\labreport_csv_import_example.csv"),
                        new ServiceModel.PostImportLabReportDataDryRun()
                                .setFileType("SIMPLE_CSV")
                                .setTimeZoneOffset("+00:00")
                                .setCreateMissingObjects(false)
                                .setUpdateExistingResults(true),
                        new ContentPart("domainObject", client.Api.getGson().toJson(labReport), MimeTypes.Json));
            }

            ServiceModel.GetObservations request = new ServiceModel.GetObservations().setLimit(100000);

            LazyResult<ServiceModel.Observation> lazyResult = client.lazyGet(cursor -> request.setCursor(cursor), () -> client.Api.get(request));

            System.out.printf("There are %d items in total\n", lazyResult.getTotalCount());

            Stream<ServiceModel.Observation> stream = client.lazyGetStream(cursor -> request.setCursor(cursor), () -> client.Api.get(request));

            long count = stream.count();

            System.out.printf("Streamed over %d items\n", count);

        }
        catch (Exception e)
        {
            System.out.printf("ERROR: %s\n%s\n", e.getMessage(), e.toString());
        }
    }

    private void FooAqts() {

        AquariusClient client = AquariusClient.createConnectedClient("doug-vm2012r2", "admin", "admin");

        System.out.printf("Connected to %s (%s)\n", client.Publish.getEndpointUrl(), client.ServerVersion.toString());

        Publish.PublicKey publicKey = client.Publish.get(new Publish.GetPublicKey());

        String xml = "<resp><status>good</status><msg>hi</msg></resp>";

        InputSource source = new InputSource(new StringReader(publicKey.Xml));

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(source);

            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();

            String modulusText = xpath.evaluate("/RSAKeyValue/Modulus", document);
            String exponentText = xpath.evaluate("/RSAKeyValue/Exponent", document);

            byte[] modulusByes = DatatypeConverter.parseBase64Binary(modulusText);
            byte[] exponentBytes = DatatypeConverter.parseBase64Binary(exponentText);

            BigInteger modulus = new BigInteger(1, modulusByes);
            BigInteger exponent = new BigInteger(1, exponentBytes);

            RSAPublicKeySpec pubSpec = new RSAPublicKeySpec(modulus, exponent);
            // Now you can encrypt the password using the public key:
            KeyFactory factory = KeyFactory.getInstance("RSA");
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");
            PublicKey pubKey = factory.generatePublic(pubSpec);
            cipher.init(Cipher.ENCRYPT_MODE, pubKey);

            String username = "admin";
            String cleartextPassword = "admin";
            byte[] encryptedPasswordBlob = cipher.doFinal(cleartextPassword.getBytes("UTF-8"));

            // And finally, you can transform the blob into a base-64 string to assign the to
            // the EncryptedPassword property of the login DTO:
            String encryptedPassword = DatatypeConverter.printBase64Binary(encryptedPasswordBlob);

            String authToken = client.Publish.post(new Publish.PostSession()
                    .setUsername(username)
                    .setEncryptedPassword(encryptedPassword));

            System.out.printf("New auth-token: %s\n", authToken);
        }
        catch(Exception e) {
        }

        ArrayList<Publish.ExtendedAttributeFilter> extendedAttributeFilters = new ArrayList<Publish.ExtendedAttributeFilter>();
        extendedAttributeFilters.add(new Publish.ExtendedAttributeFilter().setFilterName("FooName").setFilterValue("BarValue"));

        Publish.LocationDescriptionListServiceResponse locations = client.Publish.get(new Publish.LocationDescriptionListServiceRequest()
                .setLocationIdentifier("SchmidtKits")
                .setExtendedFilters(extendedAttributeFilters));

        Acquisition.PostReportResponse uploadResponse = client.Acquisition.postFileWithRequest(new File("C:\\Users\\Doug.Schmidt\\Downloads\\F4xxx Sample Scattergraphs.pdf"), new Acquisition.PostReportAttachment().setTitle("My Title").setLocationUniqueId(locations.LocationDescriptions.get(0).UniqueId));

        System.out.printf("Found %d locations\n", locations.LocationDescriptions.size());
    }

}
