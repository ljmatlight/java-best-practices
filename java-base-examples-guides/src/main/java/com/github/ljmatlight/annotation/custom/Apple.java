package com.github.ljmatlight.annotation.custom;

import com.github.ljmatlight.annotation.custom.FruitColor.Color;

/**
 * 苹果（使用自定义注解）
 *
 * @author tengpeng.gao
 * @since 2018/7/26
 */
public class Apple {

    @FruitName("红富士苹果")
    private String name;

    @FruitColor(fruitColor = Color.RED)
    private String color;

    @FruitProvider(id = 1, name = "山东烟台XXX水果有限公司", address = "山东烟台市牟平区大窑街道")
    private String provider;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
