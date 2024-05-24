package com.example.runnableInterface;

import com.example.base.SimpleThread;
import com.example.base.SimpleThreadRunnable;

public class SimpleThreadRunnableMain {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Runnable 接口的实现，一种方式是实现类的方式，一种是匿名内部类实现
         */
        SimpleThreadRunnable simpleThread1 = new SimpleThreadRunnable();
        SimpleThreadRunnable simpleThread2 = new SimpleThreadRunnable();

        // 设置线程名称
        simpleThread1.setName("Simple Thread-Child1");
        simpleThread2.setName("Simple Thread-Child2");

        simpleThread1.start();
        simpleThread2.start();

        System.out.println("匿名内部类实现: ");
        new Thread(new Runnable() {
            int count = 10;
            @Override
            public void run() {
                while (count > 0) {
                    System.out.println("匿名内部类运行线程信息: 简单倒数线程，执行第 " + count + " 个阶段");
                    try {
                        Thread.sleep(500L);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    count --;

                }
            }
        }).start();
    }
}
