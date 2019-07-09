package com.cz.bigtalkdesign.chapter1.simplefactory;

/**
 * @ClassName: OperationDiv
 * @date: 2019/7/4  13:15
 * @author: guohao
 * @Description: 除法运算类
 */
public class OperationDiv extends Operation{
    @Override
    public double getResult() {
        double result = 0;
        result = this.getNumberA() / this.getNumberB();
        return result;
    }
}
