package com.cz.bigtalkdesign.chapter10.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Secretary
 * @date: 2019/7/4  17:40
 * @author: guohao
 * @Description: 前台秘书类
 */
public class Secretary implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private String action;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers) {
            observer.update();
        }
    }

    @Override
    public String subjectState(String state) {
        this.action = state;
        return action;
    }
}
