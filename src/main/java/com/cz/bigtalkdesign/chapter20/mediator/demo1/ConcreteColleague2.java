package com.cz.bigtalkdesign.chapter20.mediator.demo1;

/**
 * @ClassName: ConcreteColleague2
 * @date: 2019/7/8  10:09
 * @author: guohao
 * @Description: 具体同事类2
 */
public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("同事2得到信息：" + message);
    }
}
