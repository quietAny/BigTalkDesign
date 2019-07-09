package com.cz.bigtalkdesign.chapter3.decorate.demo1;

/**
 * @ClassName: ConcreteComponent
 * @date: 2019/7/4  14:05
 * @author: guohao
 * @Description:
 */
public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("具体对象的操作");
    }
}
