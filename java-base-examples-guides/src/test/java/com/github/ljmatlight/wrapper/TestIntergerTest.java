package com.github.ljmatlight.wrapper;

import org.junit.Assert;
import org.junit.Test;

/**
 * Description：
 * <br /> Author：ljmatlight
 */
public class TestIntergerTest {

    @Test
    public void testInt() throws Exception {

        Integer integerA = 2;
        int intB = 2;

        System.out.println("(integerA == intB) === " + TestInterger.testInt(integerA, intB)); // true
//        Assert.assertTrue(TestInterger.testInt(integerA, intB));
    }

}