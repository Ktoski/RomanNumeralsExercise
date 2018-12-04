package com.crosswords;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class ConversionTests {

    private RomanNumeralUtils romanNumeralUtils = new RomanNumeralUtilsImp();

    @DataProvider
    public static Object[][] data() {
        return new Object[][] {
                { 1234, "MCCXXXIV" },
                { 34, "XXXIV" },
                { 2342, "MMCCCXLII" },
                { 9, "IX" },
                { 78, "LXXVIII" },
                { 11, "XI" },
                { 932, "CMXXXII" },
                { 683, "DCLXXXIII" },
        };
    }


    /**
     * @param arabicInput
     * @param expectedResult
     */
    @Test
    @UseDataProvider("data")
    public void simpleTestWithDataProvider(int arabicInput, String expectedResult){

        String result = romanNumeralUtils.arabicToRoman(arabicInput);
        Assert.assertEquals(expectedResult, result);
    }

}
