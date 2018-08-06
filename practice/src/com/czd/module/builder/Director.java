package com.czd.module.builder;

/**
 * Created by Administrator on 2018/1/24.
 * 导演类，相当于具体信息生产者
 */
public class Director {
    private Builder builder=new ConcreteBuilder();
    public Product getAproduct(){
        builder.setPart("1","x7");
        return  builder.getProduct();
    }
    public Product getBproduct(){
        builder.setPart("2","qq");
        return  builder.getProduct();
    }
}
