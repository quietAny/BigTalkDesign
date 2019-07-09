package com.cz.bigtalkdesign.chapter6.prototype.demo1;

/**
 * @ClassName: Client
 * @date: 2019/7/4  15:35
 * @author: guohao
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1("I");
        ConcretePrototype1 concretePrototype2 = (ConcretePrototype1)concretePrototype1.clone();
        System.out.println(concretePrototype2.getId());
    }
}
