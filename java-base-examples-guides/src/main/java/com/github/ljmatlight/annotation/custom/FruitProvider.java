package com.github.ljmatlight.annotation.custom;

import java.lang.annotation.*;

/**
 * 水果供应商
 *
 * @author tengpeng.gao
 * @since 2018/7/26
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FruitProvider {

    /**
     * 供应商编号
     *
     * @return 供应商编号
     */
    int id() default -1;

    /**
     * 供应商名称
     *
     * @return 供应商名称
     */
    String name() default "";

    /**
     * 供应商地址
     *
     * @return 供应商地址
     */
    String address() default "地址不详";

}
