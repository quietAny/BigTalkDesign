package com.cz.bigtalkdesign.chapter22.interpreter;

/**
 * @ClassName: NotTerminalExpression
 * @date: 2019/7/8  13:32
 * @author: guohao
 * @Description:
 */
public class NotTerminalExpression extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
