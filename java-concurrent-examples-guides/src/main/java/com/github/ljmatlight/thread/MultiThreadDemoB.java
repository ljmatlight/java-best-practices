package com.github.ljmatlight.thread;

/**
 * 亲身体验一下多线程 线程实现方式二 之 继承Runnable接口
 *
 * @author ljmatlight
 * @date 2018/4/27
 */
public class MultiThreadDemoB {

    public static void main(String[] args) {

        Thread threadA = new Thread(new ThreadDemoBThreadA());
        Thread threadB = new Thread(new ThreadDemoBThreadB());

        threadA.start();
        threadB.start();

    }

}

class ThreadDemoBThreadA implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " == " + i);
        }
    }

}

class ThreadDemoBThreadB extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " == " + i);
        }
    }

}