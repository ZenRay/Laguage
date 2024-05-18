package com.example;


public class Laptop {
    public String name;
    public String manufacturer;

    public void start(){
        System.out.println("计算机开机");
    }


    public void shutdown(){
        System.out.println("计算机关机");
    }

    public void pluginExternalHardware(ExternelHardware hardware){
        /**
         * 多态的类，可以调用父类类中已经抽象出来的方法，但是对于子类中的定制化方法不能直接调用
         * 也就是说 hardware 是可以调用 hardware.open() 和 hardwware.close() 但是不能调用
         * 鼠标点击和键盘输入方法，因此使用向下转型的方式来实现获取子类对象之后在分别调用自有方法
         */
        if(hardware == null){
            System.out.println("未接入正确设备");
        }else if(hardware instanceof Mouse){
            Mouse mouse = (Mouse) hardware;
            mouse.open();

            mouse.clickMouse();
            mouse.close();
        } else if (hardware instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) hardware;
            keyboard.open();

            keyboard.inputKeyboard();

            keyboard.close();
        }
    }

}
