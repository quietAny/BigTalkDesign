package com.cz.bigtalkdesign.chapter20.mediator.demo1;

/**
 * @ClassName: ConcreteMediator
 * @date: 2019/7/8  10:06
 * @author: guohao
 * @Description: 具体中介类
 */
public class ConcreteMediator  extends Mediator{

    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == concreteColleague1){
            concreteColleague1.notify(message);
        }
        else if(colleague == concreteColleague2){
            concreteColleague2.notify(message);
        }
    }
}
