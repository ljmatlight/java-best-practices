package com.github.ljmatlight.annotation.custom;

import java.lang.annotation.*;

/**
 * 表示水果颜色注解
 *
 * @author tengpeng.gao
 * @since 2018/7/26
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FruitColor {

    /**
     * 水果颜色枚举
     */
    enum Color {

        /**
         * 蓝色
         */
        BLUE,

        /**
         * 红色
         */
        RED,

        /**
         * 绿色
         */
        GREEN
    }

    /**
     * 获取水果的颜色
     *
     * @return 水果颜色
     */
    Color fruitColor() default Color.GREEN;

}
