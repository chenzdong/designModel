package com.czd.module.factory.factory;

/**
 * @author: czd
 * @create: 2018/3/8 14:51
 */
public class FactoryDiv implements IFactory {
    @Override
    public Operation getOperation() {
        return new OperationDiv();
    }
}
