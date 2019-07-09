package com.cz.bigtalkdesign.chapter18.command.demo2;

/**
 * @ClassName: Invoker
 * @date: 2019/7/5  17:58
 * @author: guohao
 * @Description: 命令执行请求
 */
public class Invoker {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
