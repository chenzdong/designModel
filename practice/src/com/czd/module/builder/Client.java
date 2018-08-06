package com.czd.module.builder;

/**
 * Created by Administrator on 2018/1/24.
 */
public class Client {
    public static void main(String[] args) {
        Director director=new Director();
        Product product1=director.getAproduct();
        product1.showProduct();
        Product product2=director.getBproduct();
        product2.showProduct();
    }

}
