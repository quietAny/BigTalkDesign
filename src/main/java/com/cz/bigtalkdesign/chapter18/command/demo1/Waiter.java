package com.cz.bigtalkdesign.chapter18.command.demo1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: Waiter
 * @date: 2019/7/5  17:19
 * @author: guohao
 * @Description: 服务员
 */
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    /**
     * 设置订单
     * @param command
     */
    public void setOrder(Command command){
        if(command.toString() == "考鸡翅"){
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        }
        else {
            orders.add(command);
            System.out.println("增加订单：" + command.toString() + "，时间：" + new Date());
        }
    }

    /**
     * 取消订单
     */
    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单：" + command.toString() + "时间：" + new Date());
    }

    /**
     * 通知全部执行
     */
    public void myNotify(){
        for (Command command: orders
             ) {
            command.excuteCommand();
        }
    }
}
