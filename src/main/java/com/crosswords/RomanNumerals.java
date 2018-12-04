package com.crosswords;


/**
 * enum class contains all necessary for conversion symbols with match values in arabic
 */
public enum RomanNumerals {

    M(1000),
    CM(900),
    D(500),
    CD(400),
    C(100),
    XC(90),
    L(50),
    XL(40),
    X(10),
    IX(9),
    V(5),
    IV(4),
    I(1);

    private int value;

    /**
     * @param value contructor method for enum class
     */
    RomanNumerals(int value){
        this.value = value;
    }

    /**
     * @return gettor methos with arabic numeral matching the roman numeral
     */
    public int getArabicValue(){
        return this.value;
    }

}
