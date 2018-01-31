package com.github.ljmatlight;

import java.util.ArrayList;

/**
 * Description：集合与数组
 * <br />  数组既可以存储基本数据类型，又可以存储对象数据类型，但是数组的长度固定，适用于长度已明确的情况下。
 * <br />  集合只能存储对象，对象类型可以不一样，且长度可变，适用于长度不明确的情况下或存储对象不同的情况下。
 * <br /> Author：ljmatlight
 */
public class ListAndArray {


    public static void main(String[] args) {

        // 数组既可以存储基本数据类型，又可以存储对象数据类型，但是数组的长度固定，适用于长度已明确的情况下。
        int[] intArray = new int[10];
        Integer[] integerArray = new Integer[10];
        for (int i = 0; i < 10; i++) {
            intArray[i] = 10 - i;
            integerArray[i] = new Integer(10 - i);
        }

        int intArrayLength = intArray.length;
        for (int i = 0; i < intArrayLength; i++) {
            System.out.println("int: " + i + " = " + intArray[i]);
        }

        int integerArrayLength = integerArray.length;
        for (int i = 0; i < integerArrayLength; i++) {
            System.out.println("Integer: " + i + " = " + integerArray[i]);
        }

        // ===================================================================

        // 集合只能存储对象，对象类型可以不一样，且长度可变，适用于长度不明确的情况下或存储对象不同的情况下。
        ArrayList<Object> objectArrayList = new ArrayList<>();
        objectArrayList.add("A");
        objectArrayList.add(1000L);
        objectArrayList.add(false);
        objectArrayList.forEach(o -> System.out.println(" o ==== " + o));

    }


}
