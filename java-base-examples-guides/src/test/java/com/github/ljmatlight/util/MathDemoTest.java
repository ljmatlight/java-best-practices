package com.github.ljmatlight.util;

import org.junit.Test;

/**
 * @description：
 * @date: 2018/4/4 10:48
 * @author： ljmatlight
 */
public class MathDemoTest extends MathDemo {

    @Test
    public void testIsEven() {
        System.out.println("======= 偶数判断 =======");
        System.out.println(super.testIsEven(2));
        System.out.println(super.testIsEven(-2));
        System.out.println(super.testIsEven(0));
        System.out.println(super.testIsEven(1));
        System.out.println(super.testIsEven(-1));
    }

    @Test
    public void testIsOddNumber() {
        System.out.println("======= 奇数判断 =======");
        System.out.println(super.testIsOddNumber(2));
        System.out.println(super.testIsOddNumber(-2));
        System.out.println(super.testIsOddNumber(0));
        System.out.println(super.testIsOddNumber(1));
        System.out.println(super.testIsOddNumber(-1));
    }

}