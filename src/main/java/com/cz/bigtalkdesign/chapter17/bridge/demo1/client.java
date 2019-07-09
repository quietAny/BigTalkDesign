package com.cz.bigtalkdesign.chapter17.bridge.demo1;

/**
 * @ClassName: client
 * @date: 2019/7/5  16:33
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {

        Abstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.Operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.Operation();
    }
}
