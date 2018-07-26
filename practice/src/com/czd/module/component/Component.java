package com.czd.module.component;

/**
 * ��ϳ�����
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
