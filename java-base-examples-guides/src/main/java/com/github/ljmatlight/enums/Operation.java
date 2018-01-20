package com.github.ljmatlight.enums;

/**
 * Description：特定于常量的方法实现
 * <br />Author： ljmatlight（随风浮云）
 */
public enum Operation {

    PLUS("+") {
        @Override
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    @Override
    public String toString() {
        return symbol;
    }

    Operation(String symbol) {
        this.symbol = symbol;
    }

    abstract double apply(double x, double y);

}
