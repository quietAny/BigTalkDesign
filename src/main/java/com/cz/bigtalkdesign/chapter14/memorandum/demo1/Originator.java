package com.cz.bigtalkdesign.chapter14.memorandum.demo1;

/**
 * @ClassName: Originator
 * @date: 2019/7/5  13:54
 * @author: guohao
 * @Description: 发起人
 */
public class Originator {

    private String state;

    /**
     *  创建备忘录
     * @return
     */
    public Memento createMemento(){
        return (new Memento(state));
    }

    /**
     * 恢复备忘录的数据
     * @param memento
     */
    public void setMemento(Memento memento){
        state = memento.getState();
    }

    /**
     * 显示数据
     */
    public void show(){
        System.out.println("state = " + state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
