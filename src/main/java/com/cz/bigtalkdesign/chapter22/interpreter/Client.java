package com.cz.bigtalkdesign.chapter22.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Client
 * @date: 2019/7/8  13:34
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<AbstractExpression>();
        list.add(new TerminalExpression());
        list.add(new NotTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression ae : list) {
            ae.interpret(context);
        }
    }
}
