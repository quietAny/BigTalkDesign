package com.cz.bigtalkdesign.chapter20.mediator.demo2;

/**
 * @ClassName: Iraq
 * @date: 2019/7/8  10:30
 * @author: guohao
 * @Description: 伊拉克
 */
public class Iraq extends Country{

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.declare(message,this);
    }

    public void getMessage(String message){
        System.out.println("伊拉克获得对方的消息:" + message);
    }

}
