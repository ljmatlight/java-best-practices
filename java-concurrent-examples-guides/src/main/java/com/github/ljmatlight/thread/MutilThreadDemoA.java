package com.github.ljmatlight.thread;


/**
 * 亲身体验一下多线程 线程实现方式一 之 继承Thread类
 *
 * @author ljmatlight
 * @date 2018/4/27
 */
public class MutilThreadDemoA {

    public static void main(String[] args) {

        ThreadDemoAThreadA threadA = new ThreadDemoAThreadA();
        ThreadDemoAThreadB threadB = new ThreadDemoAThreadB();

        threadA.start();
        threadB.start();
        System.out.println("运行结束！");

    }

}

class ThreadDemoAThreadA extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " == " + i);
        }
    }

}

class ThreadDemoAThreadB extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " == " + i);
        }
    }

}