package com.cz.bigtalkdesign.chapter14.memorandum.demo1;

/**
 * @ClassName: Memento
 * @date: 2019/7/5  13:55
 * @author: guohao
 * @Description: 备忘录
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
