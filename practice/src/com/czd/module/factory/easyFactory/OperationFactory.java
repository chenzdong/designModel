package com.czd.module.factory.easyFactory;
/**
 * 计算工厂类
 * @author: czd
 * @create: 2018/3/8 14:25
 */
public class OperationFactory {
   public static Operation getOperation(String opera){
       Operation operation=null;
       switch (opera){
           case("+"):
               operation=new OperationAdd();
               break;
           case("-"):
               operation=new OperationSub();
               break;
           case("*"):
               operation=new OperationMul();
               break;
           case("/"):
               operation=new OperationDiv();
               break;
           default:
               break;
       }
       return  operation;
   }
}
