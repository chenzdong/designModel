package com.czd.module.builder;

/**
 * Created by Administrator on 2018/1/24.
 * 抽象建造类，负责获取产品，并且对产品属性进行赋值
 */
public abstract  class Builder {
    public abstract void setPart(String arg1,String arg2);
    public abstract Product getProduct();
}
