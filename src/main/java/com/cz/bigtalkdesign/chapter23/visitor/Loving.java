package com.cz.bigtalkdesign.chapter23.visitor;

/**
 * @ClassName: Loving
 * @date: 2019/7/8  13:54
 * @author: guohao
 * @Description: 恋爱状态
 */
public class Loving implements Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName() +" "+ this.getClass().getSimpleName() + "时，凡事不懂也要装懂");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName() +" "+ this.getClass().getSimpleName() + "时，遇事懂也装作不懂");
    }
}
