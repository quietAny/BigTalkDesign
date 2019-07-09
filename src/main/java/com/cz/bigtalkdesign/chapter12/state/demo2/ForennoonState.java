package com.cz.bigtalkdesign.chapter12.state.demo2;

/**
 * @ClassName: ForennoonState
 * @date: 2019/7/5  10:53
 * @author: guohao
 * @Description: 上午工作状态
 */
public class ForennoonState extends State {
    @Override
    public void writeProgram(Worker worker) {
        if(worker.getHour() < 12){
            System.out.println("当前工作时间：" + worker.getHour() + "，精神百倍");
        }
        else{
            worker.setState(new NoonState());
            worker.work();
        }
    }
}
