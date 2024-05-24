package com.example.join;

import com.example.base.SimpleThread;

public class SimpleThreadMain {
    public static void main(String[] args) throws InterruptedException {
        SimpleThread simpleThread = new SimpleThread();
        SimpleThreadInner innerThread = new SimpleThreadInner();

        // 设置线程名称
        simpleThread.setName("Simple Thread-Child1");
        innerThread.setName("Simple Thread-Inner Child");

        // 同时增加计数器
        innerThread.setCounter(30);

        // 将 simpleThread 给到 Inner 以进行 JOIN 操作
        innerThread.setOtherThread(simpleThread);

        // 开启线程并运行
        innerThread.start();
        simpleThread.start();


        simpleThread.join();
        innerThread.join();
        // 如果没有上面的 JOIN 操作，会直接执行下面的 Print 语句，有 JOIN 后会等待上面两个执行完之后才会执行下面的语句
        System.out.println("主线程结束");
    }
}
