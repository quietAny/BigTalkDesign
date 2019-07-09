package com.cz.bigtalkdesign.chapter15.componet.demo1;

/**
 * @ClassName: Leaf
 * @date: 2019/7/5  14:34
 * @author: guohao
 * @Description: 叶子类
 */
public class Leaf extends Component {


    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("cannot add a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {

        System.out.println(name + "-" + depth);
    }
}
