package com.cz.bigtalkdesign.chapter15.componet.demo1;

import java.util.ArrayList;
import java.util.List;



/**
 * @ClassName: Composite
 * @date: 2019/7/5  14:38
 * @author: guohao
 * @Description:
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(name + "-" + depth);
        for (Component componet: children) {
            componet.display(depth);
        }
    }
}
