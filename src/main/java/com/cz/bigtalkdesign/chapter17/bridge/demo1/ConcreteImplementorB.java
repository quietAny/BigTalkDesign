package com.cz.bigtalkdesign.chapter17.bridge.demo1;

/**
 * @ClassName: ConcreteImplementorA
 * @date: 2019/7/5  16:28
 * @author: guohao
 * @Description:
 */
public class ConcreteImplementorB extends Implementor {
    @Override
    public void Operation() {
        System.out.println("具体实现B中的方法执行");
    }
}
