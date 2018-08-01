package com.czd.module.chainOfResponsibility;

/**
 * 第一接手人
 *
 * @author: czd
 * @create: 2018/8/1 15:14
 */
public class ThirdHandler extends Handler {
    public ThirdHandler(String name) {
        super(name);
    }
    @Override
    public void handlerRequest(Request request) {
        if(request.getPrice()<10000){
            System.out.println("third handle:"+name+" accept "+request.getContent());
        }else {
            this.nextHandler.handlerRequest(request);
        }
    }
}
