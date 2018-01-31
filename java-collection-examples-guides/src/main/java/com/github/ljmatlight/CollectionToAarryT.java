package com.github.ljmatlight;

import java.util.ArrayList;

/**
 * Description：集合 <T> T[] toArray(T[] a); 的使用
 * <br /> Author：ljmatlight
 */
public class CollectionToAarryT {


    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>() {
            {
                add("第一个元素");
                add("第二个元素");
            }
        };

        // 空间充足，从数组最前端开始进行覆盖式填充集合元素，填充完成后，如果后面一位还有空间，将其设为null，如果之后还有空间则不改变其原来的数据内容。
        String[] arrayT = {"1", "2", "3", "4", "5"};

//        String[] arrayT = {"1", "2"}; // 空间恰好满足需求。
//        String[] arrayT = {"1", "2", "3"}; // 空间充足，从数组最前端开题填充集合元素，填充完成后，如果后面一位还有空间，将其设为null。

//        String[] arrayT = {}; // 空间不足直接开辟新空间进行
        int arrayTLength = arrayT.length;
        for (int i = 0; i < arrayTLength; i++) {
            System.out.println(i + " = " + arrayT[i]);
        }

        // ========================================================
        System.out.println("\n======================================================== \n");

        arrayT = arrayList.toArray(arrayT);
        arrayTLength = arrayT.length;
        for (int i = 0; i < arrayTLength; i++) {
            System.out.println(i + " = " + arrayT[i]);
        }

    }


}
