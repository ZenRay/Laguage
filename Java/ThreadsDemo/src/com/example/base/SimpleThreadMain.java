package com.example.base;

public class SimpleThreadMain {
    public static void main(String[] args) throws InterruptedException {
        SimpleThread simpleThread1 = new SimpleThread();
        SimpleThread simpleThread2 = new SimpleThread();

        // 设置线程名称
        simpleThread1.setName("Simple Thread-Child1");
        simpleThread2.setName("Simple Thread-Child2");


        // 开启线程并运行
        simpleThread1.start();
        simpleThread2.start();

    }
}
