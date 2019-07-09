package com.cz.bigtalkdesign.chapter20.mediator.demo2;

/**
 * @ClassName: USA
 * @date: 2019/7/8  10:26
 * @author: guohao
 * @Description:
 */
public class USA extends Country {

    public USA(UnitedNations mediator) {
        super(mediator);
    }

    /**
     * 申明
     * @param message
     */
    public void send(String message){
        mediator.declare(message,this);
    }

    /**
     * 获得消息
     */
    public void getMessage(String message){
        System.out.println("美国获得对方的消息:" + message);
    }
}
