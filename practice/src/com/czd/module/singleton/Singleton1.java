package com.czd.module.singleton;

/**
 * Created by Administrator on 2018/1/23.
 */
public class Singleton1 {
    //饿汉式
    private static Singleton1 singleton1=new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return singleton1;
    }
}
