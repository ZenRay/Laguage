package com.example.join;

/**
 * 本模块是为了描述线程中的 JOIN 作用
 * join() 方法是 Java 多线程编程中的一个重要方法，它的作用是等待线程执行结束，并且可以在其他线程中调用 join() 方法的线程中继续执行。
 * 具体来说，当一个线程调用另一个线程的 join() 方法时，它会被阻塞，直到被调用的线程执行完毕。这意味着调用 join() 方法的线程会等待被调用线程的完成，然后才能继续执行。
 *
 * 作用
 * join() 方法的主要作用有以下几点：
 *
 * 1. 线程同步： join() 方法可以用于线程间的同步，确保某个线程在其他线程完成之后再继续执行。这对于需要等待其他线程完成某些工作后再进行后续操作的情况非常有用。
 *
 * 2. 线程协作： join() 方法也可以用于线程之间的协作，一个线程可以等待其他线程的结果，然后再进行下一步操作。这对于分解任务并行执行的场景非常有用。
 *
 * 3. 等待线程完成： 在某些情况下，我们需要等待一个线程执行完成后才能继续执行其他操作，这时可以使用 join() 方法来等待线程完成。
 */
public class SimpleThreadInner extends Thread {
    private Thread otherThread;
    int counter = 20;

    @Override
    public void run() {
        // 对其他线程进行 JOIN 操作，查看运行的情况
        if (otherThread != null) {
            try {
                System.out.println(
                        otherThread.getName() + " 进行 JOIN 操作，会等待" + otherThread.getName() + "执行完成"
                );
                otherThread.join();
                System.out.println(otherThread.getName() + "执行完成");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        while (counter > 0) {
            System.out.print("运行的线程信息 <" + currentThread().getName() + ">: ");
            System.out.println("简单倒数线程，执行到第 " + counter + "个阶段");

            counter--;
            try {
                // sleep 会休眠，且如果有锁不会释放
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(getName() + " 线程执行结束");

    }


    public Thread getOtherThread() {
        return otherThread;
    }

    public void setOtherThread(Thread otherThread) {
        this.otherThread = otherThread;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
