package com.czd.module.observer;

/**
 * 具体目标类
 *
 * @author: czd
 * @create: 2018/8/6 10:05
 */
public class ConcreteSubject extends Subject{

    public ConcreteSubject(String name){
        System.out.println(name+"初始化成功");
        this.name=name;
    }
    @Override
    public void notifyObserver() {
        System.out.println("通知所有观察者");
        for(Observer ob:observers){
            ob.update();
        }
    }
}
