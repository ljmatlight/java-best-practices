package com.github.ljmatlight.util;

/**
 * @description： 数学相关DEMO
 * @date: 2018/4/4 10:47
 * @author： ljmatlight
 */
public class MathDemo {

    /**
     * @description： 判断i是否为偶数
     * @date: 2018/4/4 10:52
     * @author： ljmatlight
     * @param i 要判断的<code>int</code> 类型的数
     * @return i为偶数返回true；为奇数则返回false
     */
    public boolean testIsEven(int i) {
        return (i & 1) == 0;
    }

    /**
     * @description： 判断i是否为奇数
     * @date: 2018/4/4 10:52
     * @author： ljmatlight
     * @param i 要判断的<code>int</code> 类型的数
     * @return i为奇数返回true；为偶数则返回false
     */
    public boolean testIsOddNumber(int i) {
        return (i & 1) != 0;
    }

}
