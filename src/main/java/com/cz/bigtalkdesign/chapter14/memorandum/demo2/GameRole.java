package com.cz.bigtalkdesign.chapter14.memorandum.demo2;

/**
 * @ClassName: GameRole
 * @date: 2019/7/5  14:09
 * @author: guohao
 * @Description: 游戏角色
 */
public class GameRole {

    private int vik;
    private int atk;
    private int def;

    /**
     * 初始化角色属性
     */
    public void getInitState(){
        this.vik = 100;
        this.atk = 100;
        this.def = 100;
    }

    /**
     * 保存角色状态
     * @return
     */
    public RoleStateMemento saveState(){
        return new RoleStateMemento(vik,atk,def);
    }

    /**
     * 恢复角色状态
     * @param roleStateMemento
     */
    public void recoveryState(RoleStateMemento roleStateMemento){
        this.vik = roleStateMemento.getVik();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    /**
     * 展示角色状态
     */
    public void displayRoleState(){
        System.out.println("生命力：" + vik + ",攻击力：" + atk + ",防御力：" + def);
    }

    /**
     * 战破
     */
    public void fight(){
        this.vik = 0;
        this.atk = 0;
        this.def = 0;
    }
}
