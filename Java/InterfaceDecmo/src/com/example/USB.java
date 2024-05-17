package com.example;

public interface USB {
    /**
     * 成员变量:
     * 1. 接口中成员变量默认是 public static final 的，所以相关信息可以不用声明
     */
    String TYPES = "USB";
    public static final String PRODUCT_COMPANY = "NEW COMPANY";

    // 默认的是 abstract 方法，可以不用声明 abstract
    public abstract void open();
    public void close();
    void interactive();

    /**
     * 默认方法：
     * 1. 默认方法，使用 default 关键字
     * 2. 默认方法是有方法体
     * 3. 默认方法在实现类中，可以重写也可以选择不重写
     */
     public default void defaultClose(){
         System.out.println("接口的 close 默认方法");
     }

    /**
     * 静态方法:
     * 1. 静态方法，使用 static 关键字
     * 2. 静态方法有方法体
     * 3. 静态方法的调用，可以使用 <接口名称>.<静态方法名称>
     */
    public static void staticClose(){
        System.out.println("接口的 close 静态方法");
    }
}
