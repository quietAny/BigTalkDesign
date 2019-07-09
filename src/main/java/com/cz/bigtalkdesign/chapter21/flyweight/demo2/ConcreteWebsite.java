package com.cz.bigtalkdesign.chapter21.flyweight.demo2;

/**
 * @ClassName: ConcreteWebsite
 * @date: 2019/7/8  13:08
 * @author: guohao
 * @Description: 具体网站类
 */
public class ConcreteWebsite extends Website {

    private String name = "";

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void Use(User user) {
        System.out.println("网站分类" + name + " 用户：" + user.getName());
    }
}
