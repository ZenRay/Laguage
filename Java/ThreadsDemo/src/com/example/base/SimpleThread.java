package com.example.base;

// 简单线程基础
public class SimpleThread extends Thread{
    int counter = 20;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        while (counter > 0) {
            System.out.print("运行的线程信息 <" + currentThread().getName() + ">: ");
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
