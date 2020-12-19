package com.xrluo.type02;

import java.util.Objects;

/**
 * 单例设计模式(静态代码块)
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        System.out.println(singleton + "\n" + singleton1);

        System.out.println(Objects.equals(singleton, singleton1));
    }
}

/**
 * 优点: 方法简单,避免线程同步的风险
 * 缺点: 类加载的时候就存在了,实际环境中有可能没有用到,造成内存的浪费.
 */
class Singleton {

    // 2. 本类内部创建对象实例化
    private final static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    // 1.构造器私有化
    private Singleton() {

    }

    // 3. 向外暴露一个静态方法
    public static Singleton getSingleton() {
        return singleton;
    }
}
