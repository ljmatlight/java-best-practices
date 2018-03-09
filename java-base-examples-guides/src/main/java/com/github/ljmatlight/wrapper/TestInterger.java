package com.github.ljmatlight.wrapper;

/**
 * Description：
 * <br /> Author：ljmatlight
 */
public class TestInterger {

    public void testIntegerAndInt() throws Exception {

        Integer integerA = 1;
        int intB = 1;

        System.out.println("integerA == intB: " + (integerA == intB));

    }

    public void testIntegerAndInteger() throws Exception {

        Integer integerA = 1;
        Integer integerB = 1;

        System.out.println("integerA == integerB: " + (integerA == integerB));

    }

    public void testIntegerEqualsInteger() throws Exception {

        Integer integerA = 1;
        Integer integerB = 1;

        System.out.println("integerA.equals(integerB): " + (integerA.equals(integerB)));

    }

}
