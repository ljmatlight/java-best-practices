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
        System.out.println("integerA==EnumInteger.一.getStatus(): " + (integerA == EnumInteger.一.getStatus()));

    }

    enum EnumInteger {
        一("测试", 1); // true
//        一("测试", new Integer(1)); // false

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
