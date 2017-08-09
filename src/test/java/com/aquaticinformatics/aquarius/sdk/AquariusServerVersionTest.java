package com.aquaticinformatics.aquarius.sdk;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class AquariusServerVersionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void Create_WithNullVersion_Throws() {
        thrown.expect(NullPointerException.class);

        AquariusServerVersion.Create(null);
    }

    @Test
    public void Create_WithEmptyString_Throws() {
        thrown.expect(NumberFormatException.class);

        AquariusServerVersion.Create("");
    }

    @Test
    public void Create_WithNegativeComponent_Throws() {
        thrown.expect(NumberFormatException.class);

        AquariusServerVersion.Create("123.-123");
    }

    private Object[] sanitizeMajorVersionTests() {
        return new Object[]{
                new Object[]{"Developer version", "0.0.0.0", "0.0.0.0"},
                new Object[]{"Early 3X version", "3.6.121", "3.6.121"},
                new Object[]{"Early NG version", "14.4.58", "2014.4.58"},
        };
    }

    @Test
    @Parameters(method = "sanitizeMajorVersionTests")
    public void toString_SanitizesMajorVersion(String reason, String apiVersion, String expected) {
        AquariusServerVersion version = AquariusServerVersion.Create(apiVersion);

        String actual = version.toString();
        assertEquals(reason, expected, actual);
    }

    private Object[] versionComparisonTests(){
        return new Object[]{
                new Object[]{"Same developer version", "0.0.0.0", "0.0.0.0", false, 0},
                new Object[]{"Developer version is always considered newer than a real version", "0.0.0.0", "15", false, 1},
                new Object[]{"Real version is always considered earlier than a developer version", "15", "0.0.0.0", true, -1},
                new Object[]{"More components is always greater", "2", "2.1", true, -1},
                new Object[]{"3X is less than NG", "3.9.123", "15.4.123", true, -1},
                new Object[]{"NG is greater than NG", "15.4.123", "3.9.123", false, 1},
                new Object[]{"PreviousYear.Last is less than NextYear.First", "15.4.123", "16.1.123", true, -1},
                new Object[]{"NextYear.First is greater than PreviousYear.Last", "16.1.123", "15.4.123", false, 1},
                new Object[]{"Simplest 3X version test is less than NG", "3", "15.4.123", true, -1},
                new Object[]{"Simplest NG version test is greater than 3X", "15.4.123", "3", false, 1},
        };
    }

    @Test
    @Parameters(method = "versionComparisonTests")
    public void Compare_VersionsCompareAsExpected(String reason, String versionText1, String versionText2, boolean expectedIs1LessThan2, int expectedCompare1With2){

        assertEquals("Test expectations are not self-consistent", expectedIs1LessThan2, expectedCompare1With2 < 0);

        AquariusServerVersion version1 = AquariusServerVersion.Create(versionText1);
        AquariusServerVersion version2 = AquariusServerVersion.Create(versionText2);

        boolean actualIsLessThan2 = version1.IsLessThan(version2);
        assertEquals(reason, expectedIs1LessThan2, actualIsLessThan2);

        int actualCompare1With2 = version1.Compare(version2);
        assertEquals(reason, expectedCompare1With2, actualCompare1With2);

        if(expectedIs1LessThan2) {
            int actualCompare2With1 = version2.Compare(version1);

            assertEquals("ver1 < ver2 should imply that ver2 > ver1", 1, actualCompare2With1);
        }
    }

    private Object[] isDeveloperBuildTests(){
        return new Object[]{
                new Object[]{"Simplest developer build", "0", true},
                new Object[]{"Common developer build", "0.0.0.0", true},
                new Object[]{"Super early alpha", "0.1", false},
                new Object[]{"Early 3.X build", "3.6", false},
                new Object[]{"Early NG build", "14.4", false},
        };
    }

    @Test
    @Parameters(method = "isDeveloperBuildTests")
    public void IsDeveloperBuild_DetectsCorrectly(String reason, String versionText, boolean expected)
    {
        AquariusServerVersion version = AquariusServerVersion.Create(versionText);
        boolean actual = version.IsDeveloperBuild();

        assertEquals(reason, expected, actual);
    }
}
