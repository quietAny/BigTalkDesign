package com.cz.bigtalkdesign.chapter22.interpreter;

/**
 * @ClassName: TerminalExpression
 * @date: 2019/7/8  13:32
 * @author: guohao
 * @Description:
 */
public class TerminalExpression extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
