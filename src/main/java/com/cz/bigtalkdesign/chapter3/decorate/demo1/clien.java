package com.cz.bigtalkdesign.chapter3.decorate.demo1;

/**
 * @ClassName: clien
 * @date: 2019/7/4  14:12
 * @author: guohao
 * @Description:
 */
public class clien {

    public static void main(String[] args) {

        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.Operation();

    }
}
