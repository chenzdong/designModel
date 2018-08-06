package com.czd.module.observer;

/**
 * 观察者接口
 *
 * @author: czd
 * @create: 2018/8/6 9:46
 */
public interface Observer {
    String getName();
    void setName(String name);
    void update();
}
