package com.czd.module.mediator;

/**
 * 客户端
 *
 * @author: czd
 * @create: 2019/1/15 10:47
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.setConcreteColleague1(colleague1);
        mediator.setConcreteColleague2(colleague2);
        colleague1.Send("eat?");
        colleague2.Send("no,go?");
    }

}
