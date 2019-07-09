package com.cz.bigtalkdesign.chapter12.state.demo2;

/**
 * @ClassName: RestState
 * @date: 2019/7/5  11:09
 * @author: guohao
 * @Description: 下班休息状态
 */
public class RestState extends State {
    @Override
    public void writeProgram(Worker worker) {
        System.out.println("当前时间：" + worker.getHour() + "，下班回家了");
    }
}
