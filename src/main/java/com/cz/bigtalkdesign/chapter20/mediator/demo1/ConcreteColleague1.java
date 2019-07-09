package com.cz.bigtalkdesign.chapter20.mediator.demo1;

/**
 * @ClassName: ConcreteColleague1
 * @date: 2019/7/8  10:09
 * @author: guohao
 * @Description: 具体同事类1
 */
public class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("同事1得到信息：" + message);
    }
}
