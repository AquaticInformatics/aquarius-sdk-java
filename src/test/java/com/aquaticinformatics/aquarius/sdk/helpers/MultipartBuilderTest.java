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
                new Object[]{"file name with csv", "file.csv","text/csv"},
                new Object[]{"application name with json", "file.json" , "application/json"},
                new Object[]{"application name with xml", "file.xml" , "application/xml"}
        };
    }

    @Test
    @Parameters(method = "multiPartBuilderTests")
    public void infer_withFileName_MimeTypeAsExpected(String reason, String fileName, String expected) {
        String actual = multipartBuilder.inferMimeTypeFromFilename(fileName);

        assertEquals(reason, expected, actual);
    }
}
