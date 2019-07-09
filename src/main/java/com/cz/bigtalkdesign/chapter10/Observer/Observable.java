package com.cz.bigtalkdesign.chapter10.Observer;

/**
 * @ClassName: Observable
 * @date: 2019/7/4  17:38
 * @author: guohao
 * @Description: 被观察者接口
 */
public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    String subjectState(String state);
}
