package com.crosswords;

/**
 * class implementing the fucntionality of converting the roman numerals
 */

class RomanNumeralUtilsImp implements RomanNumeralUtils{


    /**
     * @param arabic Takes the arabic number as int
     * method calculate module of arabic number, if less than the value takes
     * the roman matching symbol and adds to base for result Roman numeral
     * loop checks this condition for roman numerals enums
     * @return roman numeral as String
     */
    @Override
    public String arabicToRoman(int arabic) {

        StringBuilder romanNumeralBuilder = new StringBuilder();
        RomanNumerals [] romanNumeralsArray = RomanNumerals.values();

        for (RomanNumerals romanNumeral: romanNumeralsArray) {
            while(arabic % romanNumeral.getArabicValue() < arabic){

                romanNumeralBuilder.append(romanNumeral);
                arabic -= romanNumeral.getArabicValue();
            }
        }
        return romanNumeralBuilder.toString();
    }
}
