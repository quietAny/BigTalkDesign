package com.cz.bigtalkdesign.chapter13.adapter.demo2;

import java.util.stream.Stream;

/**
 * @ClassName: ForeignCenter
 * @date: 2019/7/5  13:23
 * @author: guohao
 * @Description: 外籍中锋
 */
public class ForeignCenter{


    private String name;

    public void Attack() {
        System.out.println("外籍中锋" + name +"进攻");
    }

    public void Defense() {
        System.out.println("外籍中锋" + name + "防守");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
