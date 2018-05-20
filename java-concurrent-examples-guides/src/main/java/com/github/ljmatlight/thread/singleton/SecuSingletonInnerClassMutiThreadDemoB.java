package com.github.ljmatlight.thread.singleton;

/**
 * 使用静态内置类实现单例模式
 *
 * @author ljmatlight
 * @date 2018/5/20
 */
public class SecuSingletonInnerClassMutiThreadDemoB {

    public static void main(String[] args) {

        MyThreadB t1 = new MyThreadB();
        MyThreadB t2 = new MyThreadB();
        MyThreadB t3 = new MyThreadB();
        t1.start();
        t2.start();
        t3.start();
    }

}

class MyThreadB extends Thread {

    @Override
    public void run() {
        System.out.println(MyObjectB.getInstance().hashCode());
    }
}


class MyObjectB {

    private static class MyObjectBHandler {
        private static MyObjectB myObjectB = new MyObjectB();
    }

    private MyObjectB() {

    }

    public static MyObjectB getInstance() {
        return MyObjectBHandler.myObjectB;
    }

}