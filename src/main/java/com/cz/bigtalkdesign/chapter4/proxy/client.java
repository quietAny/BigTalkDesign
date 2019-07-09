package com.cz.bigtalkdesign.chapter4.proxy;

/**
 * @ClassName: client
 * @date: 2019/7/4  15:00
 * @author: guohao
 * @Description:
 */
public class client {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl("娇娇");

        Proxy proxy = new Proxy(mm);
        proxy.GiveDolls();
        proxy.GiveChocolate();
        proxy.GiveFlowers();
    }
}
