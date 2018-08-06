package com.czd.module.observer;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标类
 *
 * @author: czd
 * @create: 2018/8/6 9:45
 */
public abstract  class Subject {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<Observer> observers=new ArrayList<>();

    public void attach(Observer observer){
        System.out.println(observer.getName()+"加入"+this.getName());
        observers.add(observer);
    }

    public void detach(Observer observer){
        System.out.println(observer.getName()+"退出"+this.getName());
        observers.remove(observer);
    }

    public abstract void notifyObserver();

}
