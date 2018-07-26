package com.github.ljmatlight.annotation.custom;

import java.lang.annotation.*;

/**
 * 表示水果的名称
 *
 * @author tengpeng.gao
 * @since 2018/7/26
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FruitName {

    /**
     * 水果的名称，默认为空字符串
     *
     * @return 水果的名称
     */
    String value() default "";

}
