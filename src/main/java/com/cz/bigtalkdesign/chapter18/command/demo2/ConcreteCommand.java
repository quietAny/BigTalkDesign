package com.cz.bigtalkdesign.chapter18.command.demo2;

/**
 * @ClassName: ConcreteCommand
 * @date: 2019/7/5  18:00
 * @author: guohao
 * @Description:
 */
public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
