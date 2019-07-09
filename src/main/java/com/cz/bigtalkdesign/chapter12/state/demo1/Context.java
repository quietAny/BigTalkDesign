package com.cz.bigtalkdesign.chapter12.state.demo1;

/**
 * @ClassName: Context
 * @date: 2019/7/5  10:23
 * @author: guohao
 * @Description:
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态：" + state.toString() );
    }

    public void Request(){
        state.handle(this);
    }
}
