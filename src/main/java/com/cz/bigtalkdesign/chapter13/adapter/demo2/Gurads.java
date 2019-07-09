package com.cz.bigtalkdesign.chapter13.adapter.demo2;

/**
 * @ClassName: Forwards
 * @date: 2019/7/5  13:20
 * @author: guohao
 * @Description: 后卫类
 */
public class Gurads extends Player {

    public Gurads(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("后卫" + name + "进攻");
    }

    @Override
    public void Defense() {
        System.out.println("后卫" + name + "防守");
    }
}
