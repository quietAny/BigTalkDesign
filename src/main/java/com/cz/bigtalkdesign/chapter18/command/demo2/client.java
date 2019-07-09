package com.cz.bigtalkdesign.chapter18.command.demo2;

/**
 * @ClassName: client
 * @date: 2019/7/5  17:59
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
