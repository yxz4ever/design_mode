package com.xrluo;

/**
 * 单例设计模式(饿汉模式)
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        System.out.println(singleton + "\n" + singleton1);
    }
}


class Singleton {
    private final static Singleton singleton = new Singleton();

    // 禁止实例化
    private Singleton() {

    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
