package com.czd.module.singleton;

/**
 * @author: czd
 * @create: 2018/6/27 14:28
 */
public enum MyEnum{
    INSTANCE;
    private EnumSingleton enumSingleton;

    private MyEnum(){
        System.out.println("开始初始化");
        enumSingleton=new EnumSingleton();
    }
    public EnumSingleton getInstance(){
        return enumSingleton;
    }
}
