package com.czd.module.prototype;

/**
 * Created by Administrator on 2018/1/25.
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype cp=new ConcretePrototype();
        for (int i = 0; i <10 ; i++) {
            ConcretePrototype clonecp= (ConcretePrototype) cp.clone();
            clonecp.show();
        }
    }
}
