package com.cz.bigtalkdesign.chapter12.state.demo2;

/**
 * @ClassName: AfternoonState
 * @date: 2019/7/5  10:58
 * @author: guohao
 * @Description: 下午工作状态
 */
public class AfternoonState extends State {

    @Override
    public void writeProgram(Worker worker) {
        if(worker.getHour() < 17){
            System.out.println("当前时间：" + worker.getHour() + "下午状态还不错，继续努力");
        }
        else {
            worker.setState(new EveningState());
            worker.work();
        }
    }
}
