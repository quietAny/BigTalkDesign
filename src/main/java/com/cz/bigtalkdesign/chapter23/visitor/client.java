package com.cz.bigtalkdesign.chapter23.visitor;

/**
 * @ClassName: client
 * @date: 2019/7/8  14:20
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.add(new Man());
        o.add(new Woman());

        //成功时的反应
        Success v1 = new Success();
        o.display(v1);

        //失败时
        Failing v2 = new Failing();
        o.display(v2);

        //恋爱时
        Loving v3 = new Loving();
        o.display(v3);

    }
}
