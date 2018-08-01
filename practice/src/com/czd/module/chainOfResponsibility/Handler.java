package com.czd.module.chainOfResponsibility;

/**
 * 通用处理抽象类
 *
 * @author: czd
 * @create: 2018/8/1 15:09
 */
public abstract class Handler {
    protected String name;
    public Handler(String name){
        this.name=name;
    }
    protected Handler nextHandler;
    public void setNextHandler(Handler handler){
        this.nextHandler=handler;
    }
    public abstract void handlerRequest(Request request);

}
