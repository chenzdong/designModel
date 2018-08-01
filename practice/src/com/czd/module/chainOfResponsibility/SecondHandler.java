package com.czd.module.chainOfResponsibility;

/**
 * 第一接手人
 *
 * @author: czd
 * @create: 2018/8/1 15:14
 */
public class SecondHandler extends Handler {
    public SecondHandler(String name) {
        super(name);
    }
    @Override
    public void handlerRequest(Request request) {
        if(request.getPrice()<50){
            System.out.println("second handle:"+name+" accept "+request.getContent());
        }else {
            this.nextHandler.handlerRequest(request);
        }
    }
}
