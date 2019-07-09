package com.cz.bigtalkdesign.chapter3.decorate.demo1;

/**
 * @ClassName: Decorator
 * @date: 2019/7/4  14:06
 * @author: guohao
 * @Description:
 */
public class Decorator extends Component {

    protected Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if(component != null){
            component.Operation();
        }
    }
}
