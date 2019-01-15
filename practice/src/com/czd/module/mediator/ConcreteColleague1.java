package com.czd.module.mediator;

/**
 * @author: czd
 * @create: 2019/1/15 10:43
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void Notify(String message) {
        System.out.println("colleague1 get message: "+message);
    }

    @Override
    public void Send(String message) {
        mediator.Send(message, this);
    }
}
