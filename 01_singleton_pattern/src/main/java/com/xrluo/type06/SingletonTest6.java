package com.xrluo.type06;

import java.util.Objects;

/**
 * 双重检查
 */
public class SingletonTest6 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        System.out.println(singleton + "\n" + singleton1);

        System.out.println(Objects.equals(singleton, singleton1));
    }
}

/**
 * 双重检查
 */
class Singleton {

    // 声明一个静态变量
    private static volatile Singleton singleton;

    // 构造器私有化
    private Singleton() {

    }

    // 声明一个静态方法
    public static Singleton getSingleton() {
        if (Objects.isNull(singleton)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(singleton)) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}
