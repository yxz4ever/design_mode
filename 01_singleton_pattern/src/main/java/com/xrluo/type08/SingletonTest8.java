package com.xrluo.type08;

import java.util.Objects;

/**
 * 枚举
 */
enum Singleton {
    SINGLETON;

    public void sayHello() {
        System.out.println("Hello");
    }


}

/**
 * 枚举
 */
public class SingletonTest8 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.SINGLETON;
        Singleton singleton1 = Singleton.SINGLETON;

        System.out.println(singleton + "\n" + singleton1);

        System.out.println(Objects.equals(singleton, singleton1));

        singleton.sayHello();
    }
}





