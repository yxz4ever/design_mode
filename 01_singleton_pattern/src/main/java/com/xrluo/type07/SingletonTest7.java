package com.xrluo.type07;

import java.util.Objects;

/**
 * 静态内部类
 */
public class SingletonTest7 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        System.out.println(singleton + "\n" + singleton1);

        System.out.println(Objects.equals(singleton, singleton1));
    }
}

/**
 * 静态内部类
 */
class Singleton {
    // 构造器私有化
    private Singleton() {

    }

    // 声明一个静态方法
    public static Singleton getSingleton() {
        return SingletonInstance.SINGLETON;
    }

    // 静态内部类,该类中有一个静态的属性
    private static class SingletonInstance {
        private static final Singleton SINGLETON = new Singleton();
    }
}
