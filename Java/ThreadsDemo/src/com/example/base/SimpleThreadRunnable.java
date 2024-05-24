package com.example.base;

/**
 * 线程创建的第二种方法
 * 使用 Runnable 接口实现，其优点是解决了 Thread 是单继承的问题，它是一个接口
 *
 */
public class SimpleThreadRunnable implements Runnable{
    private String name;
    int counter = 20;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }


    @Override
    public void run() throws RuntimeException{
        while (counter > 0) {
            System.out.print("运行的线程信息 <" + Thread.currentThread().getName() + ">: ");
            System.out.println("简单倒数线程，执行到第 " + counter + "个阶段");

            counter --;
            // sleep 会休眠，且如果有锁不会释放
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 因为接口没有进行线程的 start 操作，因此将 Runnable 的实现对象作为 target 传给 Thread 进行
     * start 调用
     */
    public void start(){
        System.out.println();
        Thread thread = new Thread(this);
        if (this.name != null) {
            thread.setName(this.name);
        }
        System.out.println(this.name + " 线程启动");
        thread.start();

    }

    public void setName(String name){
        this.name = name;
    }


    public String getName(){
        return this.name;
    }

}
