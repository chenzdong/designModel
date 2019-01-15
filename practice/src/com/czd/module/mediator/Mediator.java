package com.czd.module.mediator;

/**
 * 中介者抽象类
 *
 * @author: czd
 * @create: 2019/1/15 10:39
 */
public abstract class Mediator  {
    public abstract void Send(String message, Colleague colleague);
}
