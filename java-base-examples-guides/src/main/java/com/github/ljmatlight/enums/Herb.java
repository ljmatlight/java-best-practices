package com.github.ljmatlight.enums;

/**
 * Description： 用 EnumMap 代替序数索引 - A
 * <br /> Author： galsang
 */
public class Herb {

    public enum Type {
        ANNUAL, BIENNAL, PERENNIAL
    }

    private final String name;
    private final Type type;

    public Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
