package com.cz.bigtalkdesign.chapter23.visitor;

/**
 * @ClassName: Success
 * @date: 2019/7/8  13:54
 * @author: guohao
 * @Description: 成功状态
 */
public class Success implements Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName() +" "+ this.getClass().getSimpleName() + "时，背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName() +" "+ this.getClass().getSimpleName() + "时，背后多半有个不成功的男人");
    }
}
