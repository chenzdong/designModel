package com.czd.module.mediator;

/**
 * @author: czd
 * @create: 2019/1/15 10:44
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void Notify(String message) {
        System.out.println("colleague2 get message: "+message);
    }

    @Override
    public void Send(String message) {
        mediator.Send(message, this);
    }
}
