package com.xrluo;

import java.util.Objects;

/**
 * 单例设计模式(饿汉模式)
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        System.out.println(singleton + "\n" + singleton1);

        System.out.println(Objects.equals(singleton, singleton1));
    }
}

/**
 * 优点: 方法简单,避免线程同步的风险
 * 缺点: 最初就直接创建了,有可能实际运行的程序并没有使用到,造成内存浪费
 */
class Singleton {

    // 2. 本类内部创建对象实例化
    private final static Singleton singleton = new Singleton();

    // 1.构造器私有化
    private Singleton() {

    }

    // 3. 向外暴露一个静态方法
    public static Singleton getSingleton() {
        return singleton;
    }
}
