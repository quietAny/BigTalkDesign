package com.cz.bigtalkdesign.chapter8.facade;

/**
 * @ClassName: client
 * @date: 2019/7/4  16:40
 * @author: guohao
 * @Description:
 */
public class client {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
