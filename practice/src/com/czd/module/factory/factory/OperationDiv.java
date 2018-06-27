package com.czd.module.factory.factory;

/**
 * 除法类
 *
 * @author: czd
 * @create: 2018/3/8 14:18
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result=0;
        if(getNumberB() == 0 ){
            System.out.println("除数不能为0");
        }
        result=getNumberA()/getNumberB();
        return result;
    }
}
