package com.cz.bigtalkdesign.chapter18.command.demo1;

/**
 * @ClassName: Command
 * @date: 2019/7/5  17:12
 * @author: guohao
 * @Description: 抽象命令类
 */
public abstract class Command {

    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    /**
     * 执行命令
     */
    abstract public void excuteCommand();
}
