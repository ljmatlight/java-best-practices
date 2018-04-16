package com.github.ljmatlight.wrapper;

/**
 * Integer 包装类型相等判断
 * @date: 2018/4/16 15:35
 * @author： galsang
 */
public class IntegerDemo {

    public void wrapperEquals() {
        Integer a = 235;
        Integer b = 235;
        if (a.equals(b)) {
            System.out.println("a.equals(b): true");
        }
    }

}
