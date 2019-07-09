package com.cz.bigtalkdesign.chapter20.mediator.demo1;

/**
 * @ClassName: Mediator
 * @date: 2019/7/8  10:03
 * @author: guohao
 * @Description: 抽象中介类
 */
public abstract class Mediator {

    public abstract void send(String message,Colleague colleague);
}
