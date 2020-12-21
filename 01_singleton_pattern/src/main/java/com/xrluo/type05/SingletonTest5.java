package com.xrluo.type05;

import java.util.Objects;

/**
 * 懒汉式 线程同步
 */
public class SingletonTest5 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        System.out.println(singleton + "\n" + singleton1);

        System.out.println(Objects.equals(singleton, singleton1));
    }
}

/**
 * 此种方法线程不安全,还是会生成多个实例
 */
class Singleton {

    // 声明一个静态变量
    private static Singleton singleton;

    // 构造器私有化
    private Singleton() {

    }

    // 声明一个静态方法
    public static Singleton getSingleton() {
        if (Objects.isNull(singleton)) {

            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }

        return singleton;
    }
}
