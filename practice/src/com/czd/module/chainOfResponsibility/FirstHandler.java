package com.czd.module.chainOfResponsibility;

/**
 * 第一接手人
 *
 * @author: czd
 * @create: 2018/8/1 15:14
 */
public class FirstHandler extends Handler {
    public FirstHandler(String name) {
        super(name);
    }
    @Override
    public void handlerRequest(Request request) {
        if(request.getPrice()<10){
            System.out.println("fisrt handle:"+name+" accept "+request.getContent());
        }else {
            this.nextHandler.handlerRequest(request);
        }
    }
}
