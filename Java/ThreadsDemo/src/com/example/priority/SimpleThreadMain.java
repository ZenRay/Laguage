package com.example.daemon;

import com.example.base.SimpleThread;

public class SimpleThreadMain {
    public static void main(String[] args) throws InterruptedException {
        SimpleThread simpleThread1 = new SimpleThread();
        SimpleThread simpleThread2 = new SimpleThread();

        // 设置线程名称
        simpleThread1.setName("Simple Thread-Child1");
        simpleThread2.setName("Simple Thread-Child2");

        // 设置 simpleThread2 为 daemon 线程，同时增加计数器
        /**
         * daemon 的作用是其他线程任务完成后需要关闭 Daemon 的进程
         */
        simpleThread2.setCounter(50);
        simpleThread2.setDaemon(true);

        // 开启线程并运行
        simpleThread1.start();
        simpleThread2.start();

    }
}
