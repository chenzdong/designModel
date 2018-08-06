package com.czd.module.observer;

/**
 * 客户端
 *
 * @author: czd
 * @create: 2018/8/6 10:10
 */
public class Client {
    public static void main(String[] args) {
        Subject s=new ConcreteSubject("M");
        Observer observer1,observer2,observer3;
        observer1=new ConcreteObserver("1");
        observer2=new ConcreteObserver("2");
        observer3=new ConcreteObserver("3");
        s.attach(observer1);
        s.attach(observer2);
        s.attach(observer3);
        //何时触发
        s.notifyObserver();
    }
}
