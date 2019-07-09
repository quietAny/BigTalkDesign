package com.cz.bigtalkdesign.chapter18.command.demo1;

/**
 * @ClassName: client
 * @date: 2019/7/5  17:22
 * @author: guohao
 * @Description:
 */
public class client {


    public static void main(String[] args) {

        //开店前准备
        Barbecuer boy = new Barbecuer();
        Command bmc1 = new BakeMuttonCommand(boy);
        Command bmc2 = new BakeMuttonCommand(boy);
        Command bcsc = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        //开店营业
        girl.setOrder(bmc1);
        girl.myNotify();
        girl.setOrder(bmc2);
        girl.myNotify();
        girl.setOrder(bcsc);
        girl.myNotify();

    }


}
