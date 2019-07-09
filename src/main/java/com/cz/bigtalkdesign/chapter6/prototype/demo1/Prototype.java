package com.cz.bigtalkdesign.chapter6.prototype.demo1;

/**
 * @ClassName: Prototype
 * @date: 2019/7/4  15:30
 * @author: guohao
 * @Description: 原型类,实现Cloneable接口的clone方法
 */
public abstract class Prototype implements Cloneable {

    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
