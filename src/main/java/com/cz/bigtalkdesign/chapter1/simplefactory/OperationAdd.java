package com.cz.bigtalkdesign.chapter1.simplefactory;

/**
 * @ClassName: OperationAdd
 * @date: 2019/7/4  10:31
 * @author: guohao
 * @Description: 加法运算类
 */
public class OperationAdd extends Operation{

    @Override
    public double getResult() {
        double result = 0;
        result = this.getNumberA() + this.getNumberB();
        return result;
    }
}
