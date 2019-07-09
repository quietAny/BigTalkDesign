package com.cz.bigtalkdesign.chapter2.strategic;

/**
 * @ClassName: client
 * @date: 2019/7/4  13:42
 * @author: guohao
 * @Description: 客户端
 */
public class client {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
