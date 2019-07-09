package com.cz.bigtalkdesign.chapter13.adapter.demo2;

/**
 * @ClassName: client
 * @date: 2019/7/5  13:23
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {
        Player a = new Forwards("巴蒂尔");
        a.Attack();
        Player b = new Gurads("麦克格雷迪");
        b.Attack();
        Player ym = new Translator("姚明");
        ym.Attack();
        ym.Defense();
    }
}
