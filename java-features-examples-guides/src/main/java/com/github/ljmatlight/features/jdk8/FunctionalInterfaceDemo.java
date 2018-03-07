package com.github.ljmatlight.features.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * Description：自定义函数接口
 * <br /> Author： ljmatlight
 */
public class FunctionalInterfaceDemo {


    public void test() throws Exception {
        MyStream<String> stream = new MyStream<>();
        stream.setList(Arrays.asList("hello", "ConsumerInterface"));
        stream.myForEach(str -> System.out.println(str));// 使用自定义函数接口书写Lambda表达式
    }

    /**
     * Description：自定义函数接口
     * <br /> Author： ljmatlight
     */
    @FunctionalInterface
    public interface ConsumerInterface<T> {

        void accept(T t);

    }

    class MyStream<T> {

        private List<T> list;

        public MyStream() {
        }

        public List<T> getList() {
            return list;
        }

        public void setList(List<T> list) {
            this.list = list;
        }

        public void myForEach(ConsumerInterface<T> consumer) {// 1
            for (T t : list) {
                consumer.accept(t);
            }
        }
    }


}
