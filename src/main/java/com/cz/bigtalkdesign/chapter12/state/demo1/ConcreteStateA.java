package com.cz.bigtalkdesign.chapter12.state.demo1;

/**
 * @ClassName: ConcreteStateA
 * @date: 2019/7/5  10:27
 * @author: guohao
 * @Description:
 */
public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
