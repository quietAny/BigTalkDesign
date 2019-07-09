package com.cz.bigtalkdesign.chapter12.state.demo2;

/**
 * @ClassName: worker
 * @date: 2019/7/5  10:44
 * @author: guohao
 * @Description:
 */
public class Worker {

    private double hour;
    private boolean finish = false;
    private State state;

    public Worker() {
        state = new ForennoonState();
    }


    /**
     * 设置状态
     * @param state
     */
    public void setState(State state){
        this.state = state;
    }

    /**
     * 工作
     */
    public void work(){
        state.writeProgram(this);
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public State getState() {
        return state;
    }
}
