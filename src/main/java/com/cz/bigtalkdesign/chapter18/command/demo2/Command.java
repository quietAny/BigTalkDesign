package com.cz.bigtalkdesign.chapter18.command.demo2;

/**
 * @ClassName: Command
 * @date: 2019/7/5  17:56
 * @author: guohao
 * @Description:
 */
public abstract class Command  {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract public void execute();
}
