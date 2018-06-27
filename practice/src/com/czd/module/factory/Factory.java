package com.czd.module.factory;

/**
 * Created by Administrator on 2018/1/23.
 */
public class Factory implements IFactory {
    @Override
    public IProduct createProduct() {
        return new Product();
    }
}
