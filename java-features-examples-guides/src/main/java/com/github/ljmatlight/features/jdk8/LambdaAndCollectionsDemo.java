package com.github.ljmatlight.features.jdk8;

import java.util.*;
import java.util.function.*;

/**
 * Description：Lambda and Collections
 * <br /> Author： ljmatlight
 */
public class LambdaAndCollectionsDemo {


    // =========================== forEach ===============================================================

    /**
     * 使用增强型for循环迭代
     *
     * @throws Exception
     */
    public void testForJDK7() throws Exception {
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        for (String str : stringArrayList) {
            if (str.length() > 3) {
                System.out.println("testForJDK7" + str);
            }
        }
    }

    /**
     * 使用forEach()结合匿名内部类迭代
     *
     * @throws Exception
     */
    public void testForEach() throws Exception {
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        stringArrayList.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                if (str.length() > 3) {
                    System.out.println("testForEach 匿名内部类" + str);
                }
            }
        });
    }

    /**
     * 使用forEach()结合Lambda表达式迭代
     *
     * @throws Exception
     */
    public void testForEachLambda() throws Exception {
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        stringArrayList.forEach(str -> {
            if (str.length() > 3) {
                System.out.println("testForEachLambda" + str);
            }
        });
    }

    // =========================== removeIf ===============================================================


    /**
     * 使用迭代器删除列表元素
     *
     * @throws Exception
     */
    public void testRemoveIfJDK7() throws Exception {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().length() > 3) // 删除长度大于3的元素
                it.remove();
        }
    }

    /**
     * 使用removeIf()结合匿名名内部类实现
     *
     * @throws Exception
     */
    public void testRemoveIf() throws Exception {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.removeIf(new Predicate<String>() { // 删除长度大于3的元素
            @Override
            public boolean test(String str) {
                return str.length() > 3;
            }
        });
    }

    /**
     * 使用removeIf()结合Lambda表达式实现
     *
     * @throws Exception
     */
    public void testRemoveIfLambda() throws Exception {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        // 删除长度大于3的元素
        list.removeIf(str -> str.length() > 3);
    }

    // =========================== replaceAll ===============================================================


    /**
     * 使用下标实现元素替换
     *
     * @throws Exception
     */
    public void testReplaceAllJDK7() throws Exception {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.length() > 3) {
                list.set(i, str.toUpperCase());
            }
        }
    }

    /**
     * 使用匿名内部类实现
     *
     * @throws Exception
     */
    public void testReplaceAll() throws Exception {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String str) {
                if (str.length() > 3) {
                    return str.toUpperCase();
                }
                return str;
            }
        });
    }

    /**
     * 使用Lambda表达式实现
     *
     * @throws Exception
     */
    public void testReplaceAllLambda() throws Exception {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.replaceAll(str -> {
            if (str.length() > 3) {
                return str.toUpperCase();
            }
            return str;
        });
    }

    // =========================== sort ===============================================================

    /**
     * Collections.sort()方法
     *
     * @throws Exception
     */
    public void testSortJDK7() throws Exception {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();
            }
        });
    }

    /**
     * List.sort()方法结合Lambda表达式
     *
     * @throws Exception
     */
    public void testSortLambda() throws Exception {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.sort(Comparator.comparingInt(String::length));
    }

    // =========================== map foreach ===============================================================

    /**
     * Java7以及之前迭代Map
     *
     * @throws Exception
     */
    public void testMapForEachJDK7() throws Exception {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Java7以及之前迭代Map: " + entry.getKey() + "=" + entry.getValue());
        }
    }

    /**
     * 使用forEach()结合匿名内部类迭代Map
     *
     * @throws Exception
     */
    public void testMapForEach() throws Exception {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer k, String v) {
                System.out.println("testMapForEach: " + k + "=" + v);
            }
        });
    }

    /**
     * 使用forEach()结合Lambda表达式迭代Map
     *
     * @throws Exception
     */
    public void testMapForEachLambda() throws Exception {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.forEach((k, v) -> System.out.println("testMapForEachLambda: " + k + "=" + v));
    }

    public void testMapGetOrDefault() throws Exception {
        // 查询Map中指定的值，不存在时使用默认值
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        // Java7以及之前做法
        if (map.containsKey(4)) { // 1
            System.out.println(map.get(4));
        } else {
            System.out.println("NoValue");
        }

        // Java8使用Map.getOrDefault()
        System.out.println(map.getOrDefault(4, "NoValue")); // 2
    }

    /**
     * Java7以及之前替换所有Map中所有映射关系
     *
     * @throws Exception
     */
    public void testMapReplaceAllJDK7() throws Exception {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            entry.setValue(entry.getValue().toUpperCase());
        }
    }

    /**
     * 使用replaceAll()结合匿名内部类实现
     *
     * @throws Exception
     */
    public void testMapReplaceAll() throws Exception {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.replaceAll(new BiFunction<Integer, String, String>() {
            @Override
            public String apply(Integer k, String v) {
                return v.toUpperCase();
            }
        });
    }

    /**
     * 使用replaceAll()结合Lambda表达式实现
     *
     * @throws Exception
     */
    public void testMapReplaceAllLambda() throws Exception {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.replaceAll((k, v) -> v.toUpperCase());
    }


    /**
     * @throws Exception
     */
    public void testMapComputeIfAbsent() throws Exception {
        Map<Integer, Set<String>> map = new HashMap<>();
        // Java7及以前的实现方式
        if (map.containsKey(1)) {
            map.get(1).add("one");
        } else {
            Set<String> valueSet = new HashSet<>();
            valueSet.add("one");
            map.put(1, valueSet);
        }
        // Java8的实现方式
        map.computeIfAbsent(1, v -> new HashSet<>()).add("yi");
    }



}
