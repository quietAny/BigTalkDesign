package com.cz.bigtalkdesign.chapter17.bridge.demo1;

/**
 * @ClassName: ConcreteImplementorA
 * @date: 2019/7/5  16:28
 * @author: guohao
 * @Description:
 */
public class ConcreteImplementorA extends Implementor {
    @Override
    public void Operation() {
        System.out.println("具体实现A中的方法执行");
    }
}
