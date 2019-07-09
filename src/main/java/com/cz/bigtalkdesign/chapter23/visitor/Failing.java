package com.cz.bigtalkdesign.chapter23.visitor;

/**
 * @ClassName: Failing
 * @date: 2019/7/8  13:54
 * @author: guohao
 * @Description: 失败状态
 */
public class Failing implements Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName() +" "+ this.getClass().getSimpleName() + "时，闷头喝酒，谁也不用劝");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName() +" "+ this.getClass().getSimpleName() + "时，眼泪汪汪，谁也劝不了");
    }
}
