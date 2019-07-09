package com.cz.bigtalkdesign.chapter20.mediator.demo1;

/**
 * @ClassName: Colleague
 * @date: 2019/7/8  10:05
 * @author: guohao
 * @Description: 抽象同事类
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
