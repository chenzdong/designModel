package com.czd.module.builder;

/**
 * Created by Administrator on 2018/1/24.
 */
public class ConcreteBuilder extends Builder {
    private  Product product=new Product();
    @Override
    public Product getProduct(){
        return product;
    }
    @Override
    public void setPart(String arg1,String arg2){
        product.setName(arg1);
        product.setType(arg2);
    }
}
