package com.cz.bigtalkdesign.chapter13.adapter.demo2;

/**
 * @ClassName: Player
 * @date: 2019/7/5  13:16
 * @author: guohao
 * @Description: 球员类
 */
public abstract class Player {

    protected String name;

    public Player(String name){
        this.name = name;
    }

    public abstract void Attack();

    public abstract void Defense();
}
