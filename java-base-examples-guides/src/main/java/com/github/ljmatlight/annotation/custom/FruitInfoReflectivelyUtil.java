package com.github.ljmatlight.annotation.custom;

import java.lang.reflect.Field;

/**
 * 水果注解反射处理器
 *
 * @author tengpeng.gao
 * @since 2018/7/26
 */
public class FruitInfoReflectivelyUtil {

    public static void getFruitInfo(Class<?> clazz) {

        Field[] fields = clazz.getDeclaredFields();

        int length = fields.length;
        for (int i = 0; i < length; i++) {
            Field field = fields[i];
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                System.out.println(" 水果名称： " + fruitName.value());
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                System.out.println(" 水果颜色： " + fruitColor.fruitColor());
            } else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                System.out.println(" 供应商编号： " + fruitProvider.id());
                System.out.println(" 供应商名称： " + fruitProvider.name());
                System.out.println(" 供应商地址： " + fruitProvider.address());
            }
        }

    }

}
