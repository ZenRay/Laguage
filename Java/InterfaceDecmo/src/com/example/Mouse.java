package com.example;

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("USB 接口的 open 抽象方法重写");
    }

    @Override
    public void close() {
        System.out.println("USB 接口的 close 抽象方法重写");
    }

    @Override
    public void interactive() {

    }
}
