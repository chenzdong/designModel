package com.czd.module.chainOfResponsibility;

import java.io.Serializable;

/**
 * 客户端类
 *
 * @author: czd
 * @create: 2018/8/1 15:20
 */
public class Client {
    public static void main(String[] args) {
        Request request1=new Request("first",9);
        Request request2=new Request("second",49);
        Request request3=new Request("third",109);

        Handler firstHandler=new FirstHandler("1");
        Handler secondHandler=new SecondHandler("2");
        Handler thirdHandler=new ThirdHandler("3");
        firstHandler.setNextHandler(secondHandler);
        secondHandler.setNextHandler(thirdHandler);

        firstHandler.handlerRequest(request1);
        firstHandler.handlerRequest(request2);
        firstHandler.handlerRequest(request3);
    }
}
