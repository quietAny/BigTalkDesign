package com.cz.bigtalkdesign.chapter3.decorate.demo1;

/**
 * @ClassName: ConcreteDecoratorA
 * @date: 2019/7/4  14:09
 * @author: guohao
 * @Description:
 */
public class ConcreteDecoratorB extends Decorator {

    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior(){

    }
}
