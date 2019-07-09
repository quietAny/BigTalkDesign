package com.cz.bigtalkdesign.chapter23.visitor;

/**
 * @ClassName: Person
 * @date: 2019/7/8  13:52
 * @author: guohao
 * @Description:
 */
public interface Person {

    public void accept(Action action);
}
