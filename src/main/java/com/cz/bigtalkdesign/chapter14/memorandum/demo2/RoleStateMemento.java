package com.cz.bigtalkdesign.chapter14.memorandum.demo2;

/**
 * @ClassName: RoleStateMemento
 * @date: 2019/7/5  14:10
 * @author: guohao
 * @Description: 角色状态备忘录
 */
public class RoleStateMemento {

    private int vik;
    private int atk;
    private int def;

    public RoleStateMemento(int vik, int atk, int def) {

        this.vik = vik;
        this.atk = atk;
        this.def = def;
    }

    public int getVik() {
        return vik;
    }

    public void setVik(int vik) {
        this.vik = vik;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
