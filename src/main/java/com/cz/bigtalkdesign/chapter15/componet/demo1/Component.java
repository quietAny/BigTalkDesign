package com.cz.bigtalkdesign.chapter15.componet.demo1;


/**
 * @ClassName: Componet
 * @date: 2019/7/5  14:31
 * @author: guohao
 * @Description: 公用接口类
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
}
