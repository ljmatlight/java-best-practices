package com.github.ljmatlight.enums;

import org.junit.Test;

/**
 * Description：
 * <br />Author： ljmatlight（随风浮云）
 */
public class OperationTest {


    @Test
    public void testOperation(){

        for (Operation op: Operation.values()) {
            System.out.printf("%f %s %f = %f%n", 2.0, op, 4.0, op.apply(2.0, 4.0));
        }

    }

}