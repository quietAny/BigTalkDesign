package com.cz.bigtalkdesign.chapter14.memorandum.demo2;

/**
 * @ClassName: RoleStateCaretaker
 * @date: 2019/7/5  14:16
 * @author: guohao
 * @Description: 角色状态管理者类
 */
public class RoleStateCaretaker {

    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
