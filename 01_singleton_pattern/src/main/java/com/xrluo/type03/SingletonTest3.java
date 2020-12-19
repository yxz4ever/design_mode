package com.xrluo.type03;

import java.util.Objects;

/**
 * 懒汉式 线程不安全
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        System.out.println(singleton + "\n" + singleton1);

        System.out.println(Objects.equals(singleton, singleton1));
    }
}

/**
 * 优点:起到懒加载,只能在单线程下使用
 * 缺点:如果是多线程,存在多个线程一起进入到if里面,产生多个实例
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
            singleton = new Singleton();
        }

        return singleton;
    }
}
