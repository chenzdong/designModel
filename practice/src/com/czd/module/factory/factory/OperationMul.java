package com.czd.module.factory.factory;

/**
 * 乘法类
 *
 * @author: czd
 * @create: 2018/3/8 14:18
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result=0;
        result=getNumberA()*getNumberB();
        return result;
    }
}
