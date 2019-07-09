package com.cz.bigtalkdesign.chapter21.flyweight.demo2;

/**
 * @ClassName: User
 * @date: 2019/7/8  13:06
 * @author: guohao
 * @Description: 用户类
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
