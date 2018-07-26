package com.github.ljmatlight.annotation.custom;

import org.junit.Test;

/**
 * 测试自定义注解的使用
 *
 * @author tengpeng.gao
 * @since 2018/7/26
 */
public class AppleTest {

    @Test
    public void testA(){
        FruitInfoReflectivelyUtil.getFruitInfo(Apple.class);
    }

}