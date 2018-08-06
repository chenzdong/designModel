package com.czd.module.observer;

/**
 * 具体观察类
 *
 * @author: czd
 * @create: 2018/8/6 10:03
 */
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void update() {
        System.out.println(this.name+"响应");
    }
}
