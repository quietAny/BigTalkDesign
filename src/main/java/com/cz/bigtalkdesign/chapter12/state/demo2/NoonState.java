package com.cz.bigtalkdesign.chapter12.state.demo2;

/**
 * @ClassName: NoonState
 * @date: 2019/7/5  10:55
 * @author: guohao
 * @Description: 中午工作状态
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Worker worker) {
        if(worker.getHour() < 13){
            System.out.println("当前时间：" + worker.getHour() + "，饿了，午饭，犯困，午休");
        }
        else {
            worker.setState(new AfternoonState());
            worker.work();
        }

    }
}
