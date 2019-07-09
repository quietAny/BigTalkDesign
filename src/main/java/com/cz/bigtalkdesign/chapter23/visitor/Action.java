package com.cz.bigtalkdesign.chapter23.visitor;

/**
 * @ClassName: Action
 * @date: 2019/7/8  13:50
 * @author: guohao
 * @Description: 状态类
 */
public interface Action {

    /**
     * 得到男人的反应
     * @param man
     */
    public void getManConclusion(Man man);

    /**
     * 得到女人的反应
     * @param woman
     */
    public void getWomanConclusion(Woman woman);
}
