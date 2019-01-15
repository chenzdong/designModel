package com.czd.module.singleton;

/**
 * 使用静态内部类实现单例模式
 *
 * @author: czd
 * @create: 2019/1/3 17:09
 */
public class StaticSingleton {
    private StaticSingleton() {}
    private static class Instance {
        private final static StaticSingleton instance = new StaticSingleton();
    }
    private static StaticSingleton getInstance() {
        return Instance.instance;
    }
}
