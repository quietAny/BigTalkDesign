package com.cz.bigtalkdesign.chapter12.state.demo2;

/**
 * @ClassName: EveningState
 * @date: 2019/7/5  11:01
 * @author: guohao
 * @Description: 晚上工作状态
 */
public class EveningState extends State {

    @Override
    public void writeProgram(Worker worker) {
        if(worker.isFinish()){
            worker.setState(new RestState());
            worker.work();
        }
        else {
            if(worker.getHour() < 21){
                System.out.println("当前时间:" + worker.getHour() + "，加班，疲累至极");
            }
            else {
                worker.setState(new SleepingState());
                worker.work();
            }
        }
    }
}
