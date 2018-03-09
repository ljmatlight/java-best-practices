package com.github.ljmatlight.features.jdk8;

import java.util.stream.Stream;

/**
 * Description：Streams
 * <br /> Author： ljmatlight
 */
public class StreamsDemo {

    /**
     * 使用Stream.forEach()迭代
     *
     * @throws Exception
     */
    public void testStreamForEach() throws Exception {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.forEach(str -> System.out.println(str));
    }

    /**
     * 过滤
     *
     * @throws Exception
     */
    public void testStreamFilter() throws Exception {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.filter(str -> str.length() == 3).forEach(str -> System.out.println(str));
    }

    /**
     * 去重
     *
     * @throws Exception
     */
    public void testStreamDistinct() throws Exception {
        Stream<String> stream = Stream.of("I", "love", "love", "love", "you", "too");
        stream.distinct().forEach(str -> System.out.println(str));
    }


}
