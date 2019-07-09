package com.cz.bigtalkdesign.chapter7.template;

/**
 * @ClassName: client
 * @date: 2019/7/4  16:30
 * @author: guohao
 * @Description:
 */
public class client {
    public static void main(String[] args) {
        AbstractClass c;
        c = new ConcreteClassA();
        c.TemplateMethond();

        c = new ConcreteClassB();
        c.TemplateMethond();

    }
}
