package com.github.ljmatlight.features.jdk8;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Description：Lambda and Anonymous Classes
 * <br /> Author： ljmatlight
 */
public class LambdaAndAnonymousClassesDemo {

    /**
     * JDK7 匿名内部类写法
     */
    public void testThreadA() throws Exception {
        new Thread(new Runnable() {// 接口名
            @Override
            public void run() {// 方法名
                System.out.println(" testThreadA - Thread run()");
            }
        }).start();
    }

    /**
     * JDK8 Lambda表达式写法
     */
    public void testThreadB() throws Exception {
        new Thread(
                () -> System.out.println(" testThreadB - Thread run()")// 省略接口名和方法名
        ).start();
    }

    /**
     * JDK8 Lambda表达式代码块写法
     */
    public void testThreadC() throws Exception {
        new Thread(() -> {
            System.out.print(" testThreadC - Hello");
            System.out.println(" Lambda");
        }).start();
    }

    /**
     * JDK7 匿名内部类写法
     */
    public void testListComparatorA() throws Exception {
        // JDK7 匿名内部类写法
        List<String> list = Arrays.asList("I", "love", "you", "too");
        Collections.sort(list, new Comparator<String>() {// 接口名
            @Override
            public int compare(String s1, String s2) {// 方法名
                if (s1 == null) {
                    return -1;
                }
                if (s2 == null) {
                    return 1;
                }
                return s1.length() - s2.length();
            }
        });
        System.out.println(" testListComparatorA - list " + list );
    }

    /**
     * JDK8 Lambda表达式写法
     */
    public void testListComparatorB() throws Exception {
        List<String> list = Arrays.asList("I", "love", "you", "too");
        Collections.sort(list, (s1, s2) -> {// 省略参数表的类型
            if (s1 == null) {
                return -1;
            }
            if (s2 == null) {
                return 1;
            }
            return s1.length() - s2.length();
        });
        System.out.println(" testListComparatorB - list " + list );

    }

    /**
     * Lambda表达式的书写形式
     * 1展示了无参函数的简写；
     * 2处展示了有参函数的简写，以及类型推断机制；
     * 3是代码块的写法；
     * 4和5再次展示了类型推断机制。
     */
    public void testLambda() throws Exception {
        // Lambda表达式的书写形式
        Runnable run = () -> System.out.println("Hello World");// 1
        ActionListener listener = event -> System.out.println("button clicked");// 2
        Runnable multiLine = () -> {// 3 代码块
            System.out.print("Hello");
            System.out.println(" lambda");
        };
        BinaryOperator<Long> add = (Long x, Long y) -> x + y;// 4
        BinaryOperator<Long> addImplicit = (x, y) -> x + y;// 5 类型推断
    }

    public void testLambdaThis() throws Exception {
        Runnable r1 = () -> System.out.println(this);
        Runnable r2 = () -> System.out.println(toString());
        r1.run();
        r2.run();
    }

    public String toString() {
        return "Hello lambda";
    }


}
