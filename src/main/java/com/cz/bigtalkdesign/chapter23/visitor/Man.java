package com.cz.bigtalkdesign.chapter23.visitor;

/**
 * @ClassName: Man
 * @date: 2019/7/8  13:53
 * @author: guohao
 * @Description:
 */
public class Man implements Person {
    @Override
    public void accept(Action action) {
        action.getManConclusion(this);
    }
}
