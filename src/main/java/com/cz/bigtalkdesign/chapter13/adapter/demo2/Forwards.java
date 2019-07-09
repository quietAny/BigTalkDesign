package com.cz.bigtalkdesign.chapter13.adapter.demo2;

/**
 * @ClassName: Forwards
 * @date: 2019/7/5  13:20
 * @author: guohao
 * @Description: 前锋类
 */
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("前锋" + name + "进攻");
    }

    @Override
    public void Defense() {
        System.out.println("前锋" + name + "防守");
    }
}
