package com.github.ljmatlight.thread;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * 亲身体验一下多线程 线程实现方式三 之 继承Callable接口 （执行结果有返回值）
 * <br />使用ExecutorService、Callable、Future实现有返回结果的多线程
 *
 * @author ljmatlight
 * @date 2018/4/27
 */
public class MutilThreadDemoC {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        System.out.println("----程序开始运行----");
        Date startTime = new Date();

        // 初始化线程池
        int nThreads = 5;
        ExecutorService pool = Executors.newFixedThreadPool(nThreads);

        // 保存线程执行结果集
        List<Future> futureList = new ArrayList<Future>();
        for (int i = 0; i < nThreads; i++) {
            Callable callable = new ThreadCDemoA(i + " ");

            // 执行任务并获取Future对象
            Future f = pool.submit(callable);
            futureList.add(f);
        }
        // 关闭线程池
        pool.shutdown();

        // 打印线程执行结果集
        futureList.forEach(f -> {
            try {
                System.out.println(f.get().toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

        Date endTime = new Date();
        System.out.println("----程序结束运行----，程序运行时间【" + (endTime.getTime() - startTime.getTime()) + "毫秒");
    }

}


class ThreadCDemoA implements Callable<Object> {

    private String taskNum;

    ThreadCDemoA(String taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public Object call() throws Exception {

        System.out.println(">>>" + taskNum + "任务启动");
        Date startTime = new Date();
        Thread.sleep(1000);
        Date endTime = new Date();
        long time = endTime.getTime() - startTime.getTime();

        System.out.println(">>>" + taskNum + "任务终止");
        return taskNum + "任务返回运行结果,当前任务时间【" + time + "毫秒】";
    }
}
