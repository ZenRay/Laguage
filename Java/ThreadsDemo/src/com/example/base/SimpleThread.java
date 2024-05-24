package com.example;

public class SimpleThread extends Thread{
    @Override
    public void run() {
        int counter = 100;
        while (counter > 0) {
            System.out.println("简单倒数线程，执行到第 " + counter + "个阶段");

            counter --;
            try {
                // sleep 会休眠，且如果有锁不会释放
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
