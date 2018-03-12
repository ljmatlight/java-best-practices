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

    public void testIntegerEqualsEnumInteger() throws Exception {

        Integer integerA = 1;
        Integer integerB = 2;
        Integer integerC = 3;

        System.out.println("integerA==EnumInteger.一.getStatus(): " + (integerA == EnumInteger.一.getStatus()));
        System.out.println("integerB==EnumInteger.二.getStatus(): " + (integerB == EnumInteger.二.getStatus()));
        System.out.println("integerC==EnumInteger.三.getStatus(): "
                + (integerC == EnumInteger.三.getStatus().intValue()));
    }

    enum EnumInteger {
        一("测试一", 1), // true
        二("测试二", new Integer(2)), // false
        三("测试三", new Integer(3)); // false

        private final String name;
        private final Integer status;

        EnumInteger(String name, Integer status) {
            this.name = name;
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public Integer getStatus() {
            return status;
        }
    }

}
