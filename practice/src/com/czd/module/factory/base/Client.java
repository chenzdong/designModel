package com.czd.module.factory.base;

/**
 * Created by Administrator on 2018/1/23.
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        product.productMethod();
    }
}
