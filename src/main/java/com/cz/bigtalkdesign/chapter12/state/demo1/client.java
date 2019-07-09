package com.cz.bigtalkdesign.chapter12.state.demo1;

/**
 * @ClassName: client
 * @date: 2019/7/5  10:29
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());

        c.Request();
        c.Request();
        c.Request();
        c.Request();

    }
}
