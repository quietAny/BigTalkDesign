package com.cz.bigtalkdesign.chapter18.command.demo1;

/**
 * @ClassName: BakeMuttonCommand
 * @date: 2019/7/5  17:17
 * @author: guohao
 * @Description: 烤羊肉串命令
 */
public class BakeMuttonCommand extends Command{

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void excuteCommand() {
        barbecuer.bakeMutton();
    }

    @Override
    public String toString() {
        return "烤羊肉串";
    }
}
