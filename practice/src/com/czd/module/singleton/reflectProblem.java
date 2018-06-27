package com.czd.module.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射问题
 *
 * @author: czd
 * @create: 2018/6/27 14:06
 */
public class reflectProblem {
    //除了枚举单例其他都有可能发生反射构建
    public static void main(String[] args) throws Exception {
        Constructor constructor=EnumSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        EnumSingleton singleton1= (EnumSingleton) constructor.newInstance();
        EnumSingleton singleton11= (EnumSingleton) constructor.newInstance();
        System.out.println(singleton1.equals(singleton11));
    }

}
