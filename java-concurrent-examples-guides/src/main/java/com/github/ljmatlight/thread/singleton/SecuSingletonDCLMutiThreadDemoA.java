package com.github.ljmatlight.thread.singleton;

/**
 * 使用DCL 双检查锁机制，既保证了不需要同步代码的异步部分，又保证了单例的效果
 *
 * @author ljmatlight
 * @date 2018/5/20
 */
public class SecuSingletonDCLMutiThreadDemoA {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }

}


class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}


class MyObject {

    private volatile static MyObject myObject;

    private MyObject() {

    }

    public static MyObject getInstance() {

        try {

            if (myObject != null) {
            } else {
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (myObject == null) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}