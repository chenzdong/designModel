package com.czd.module.factory.easyFactory;

import java.util.Scanner;

/**
 * 具体操作类
 *
 * @author: czd
 * @create: 2018/3/8 14:31
 */
public class Client {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入第一个数");
//        double numberA=sc.nextDouble();
//        System.out.println("请输入第二个数");
//        double numberB=sc.nextDouble();
//        System.out.println("请输入操作：+ - * /");
//        String  opera=sc.next();
        String opera="-";
        double numberA=1;
        double numberB=5;
        Operation operation=OperationFactory.getOperation(opera);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        System.out.println(operation.getResult());
    }

}
