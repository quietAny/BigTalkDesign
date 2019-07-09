package com.cz.bigtalkdesign.chapter3.decorate.demo1;

/**
 * @ClassName: ConcreteDecoratorA
 * @date: 2019/7/4  14:09
 * @author: guohao
 * @Description:
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
