package com.czd.module.mediator;

/**
 * 抽象同事类
 * @author: czd
 * @create: 2019/1/15 10:41
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void Notify(String message);
    public abstract void Send(String message);
}
