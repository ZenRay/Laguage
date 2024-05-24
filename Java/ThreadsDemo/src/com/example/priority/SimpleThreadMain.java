package com.example.priority;

import com.example.base.SimpleThread;

public class SimpleThreadMain {
    public static void main(String[] args) throws InterruptedException {
        SimpleThread simpleThread1 = new SimpleThread();
        SimpleThread simpleThread2 = new SimpleThread();

        // 设置线程名称
        simpleThread1.setName("Simple Thread-Child1");
        simpleThread2.setName("Simple Thread-Child2");

        // 同时增加计数器
        simpleThread2.setCounter(50);

        /**
         * 线程优先级:
         * 1. 最低优先级是 1
         * 2. 最高优先级 10
         * 3. 普通优先级是 5
         */
        System.out.println("Thread 最高优先级: " + Thread.MAX_PRIORITY);
        System.out.println("Thread 最低优先级: " + Thread.MIN_PRIORITY);
        System.out.println("Thread 常规优先级: " + Thread.NORM_PRIORITY);

        System.out.println(
                "Simple Thread-Child2 当前优先级: " + simpleThread2.getPriority() +
                        "将修改为最高优先级"
        );
        simpleThread2.setPriority(Thread.MAX_PRIORITY);


        // 开启线程并运行
        simpleThread1.start();
        simpleThread2.start();

    }
}
