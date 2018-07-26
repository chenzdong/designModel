package com.czd.module.component;

/**
 * 组合抽象类
 *
 * @author: czd
 * @create: 2018/7/26 10:33
 */
public abstract class Component  {
    protected String name;
    public Component(String name){
        this.name=name;
    }
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display();
}
