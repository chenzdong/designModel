package com.czd.module.factory.factory;

/**
 * 加法类
 *
 * @author: czd
 * @create: 2018/3/8 14:18
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result=0;
        result=getNumberA()+getNumberB();
        return result;
    }
}
