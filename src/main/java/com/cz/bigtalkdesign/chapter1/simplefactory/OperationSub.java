package com.cz.bigtalkdesign.chapter1.simplefactory;

/**
 * @ClassName: OperationSub
 * @date: 2019/7/4  13:08
 * @author: guohao
 * @Description: 减法运算类
 */
public class OperationSub extends Operation{
    @Override
    public double getResult() {
        double resutlt = 0;
        resutlt = this.getNumberA() - this.getNumberB();
        return resutlt;
    }
}
