package com.github.ljmatlight.thread.singleton;

/**
 * 使用枚举类实现单例模式 推荐使用
 *
 * @author ljmatlight
 * @date 2018/5/20
 */
public class SecuSingletonEnumMutiThreadDemoC {

    public static void main(String[] args) {

        MyThreadC t1 = new MyThreadC();
        MyThreadC t2 = new MyThreadC();
        MyThreadC t3 = new MyThreadC();
        t1.start();
        t2.start();
        t3.start();
    }

}

class MyThreadC extends Thread {

    @Override
    public void run() {
        System.out.println(EnumSingleton.getInstance().hashCode());
    }
}

class EnumSingleton {
    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private EnumSingleton singleton;

        //JVM会保证此方法绝对只调用一次
        Singleton() {
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return singleton;
        }
    }
}

