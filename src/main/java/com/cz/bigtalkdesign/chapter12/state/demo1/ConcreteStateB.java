package com.cz.bigtalkdesign.chapter12.state.demo1;

/**
 * @ClassName: ConcreteStateB
 * @date: 2019/7/5  10:28
 * @author: guohao
 * @Description:
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
