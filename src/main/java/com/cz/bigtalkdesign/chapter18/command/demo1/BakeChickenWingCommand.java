package com.cz.bigtalkdesign.chapter18.command.demo1;

/**
 * @ClassName: BakeMuttonCommand
 * @date: 2019/7/5  17:17
 * @author: guohao
 * @Description: 烤鸡翅命令
 */
public class BakeChickenWingCommand extends Command{

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void excuteCommand() {
        barbecuer.bakeChickenWing();
    }

    @Override
    public String toString() {
        return "烤鸡翅";
    }
}
