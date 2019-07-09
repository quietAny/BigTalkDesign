package com.cz.bigtalkdesign.chapter2.strategic;

/**
 * @ClassName: Context
 * @date: 2019/7/4  13:41
 * @author: guohao
 * @Description: 上下文
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //上下文接口
    public void contextInterface(){
        strategy.AlgorithmInterface();
    }
}
