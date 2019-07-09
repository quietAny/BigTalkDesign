package com.cz.bigtalkdesign.chapter1.simplefactory;

/**
 * @ClassName: OperationMul
 * @date: 2019/7/4  13:14
 * @author: guohao
 * @Description: 乘法运算类
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = this.getNumberA() * this.getNumberB();
        return result;
    }
}
