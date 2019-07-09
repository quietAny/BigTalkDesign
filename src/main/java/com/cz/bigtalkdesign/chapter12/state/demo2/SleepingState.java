package com.cz.bigtalkdesign.chapter12.state.demo2;

/**
 * @ClassName: SleepingState
 * @date: 2019/7/5  11:08
 * @author: guohao
 * @Description: 睡眠状态类
 */
public class SleepingState extends State {
    @Override
    public void writeProgram(Worker worker) {
        System.out.println("当前时间：" + worker.getHour() + "，不得不睡了");
    }
}
