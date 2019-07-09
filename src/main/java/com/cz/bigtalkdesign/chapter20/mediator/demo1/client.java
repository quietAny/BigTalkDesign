package com.cz.bigtalkdesign.chapter20.mediator.demo1;

/**
 * @ClassName: client
 * @date: 2019/7/8  10:17
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {

        ConcreteMediator concreteMediator = new ConcreteMediator();

        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(concreteMediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(concreteMediator);

        concreteMediator.setConcreteColleague1(concreteColleague1);
        concreteMediator.setConcreteColleague2(concreteColleague2);

        concreteColleague1.send("吃过饭了吗？");
        concreteColleague2.send("没有，你呢？");
    }
}
