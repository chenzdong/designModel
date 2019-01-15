package com.czd.module.factory.base;

/**
 * Created by Administrator on 2018/1/23.
 */
public class Product implements IProduct {
    @Override
    public void productMethod(){
        System.out.println("产品");
    }
}
