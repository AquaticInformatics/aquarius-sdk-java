package com.aquaticinformatics.aquarius.sdk.helpers;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;



import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MultipartBuilderTest{
    private MultipartBuilder multipartBuilder;
    @Before
    public void forEachTest() {
        multipartBuilder = new MultipartBuilder();
    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private Object[] multiPartBuilderTests() {
        return new Object[]{
                    new Object[]{"A CSV file", "file.csv","text/csv"},
                new Object[]{"A JSON file", "file.json" , "application/json"},
                new Object[]{"A XML file", "file.xml" , "application/xml"}
        };
    }

    @Test
    @Parameters(method = "multiPartBuilderTests")
    public void inferMimeTypeFromFilename_supportedFileTypes_ReturnsExpectedMimeType(String reason, String fileName, String expected) {
        String actual = multipartBuilder.inferMimeTypeFromFilename(fileName);

        assertEquals(reason, expected, actual);
    }
}
