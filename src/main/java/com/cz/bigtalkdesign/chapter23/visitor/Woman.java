package com.cz.bigtalkdesign.chapter23.visitor;

/**
 * @ClassName: Woman
 * @date: 2019/7/8  13:52
 * @author: guohao
 * @Description:
 */
public class Woman implements Person{
    @Override
    public void accept(Action action) {
        action.getWomanConclusion(this);
    }
}
