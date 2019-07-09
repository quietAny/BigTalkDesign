package com.cz.bigtalkdesign.chapter14.memorandum.demo2;

/**
 * @ClassName: client
 * @date: 2019/7/5  14:17
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {

        //大战boss前
        GameRole gameRole = new GameRole();
        gameRole.getInitState();
        gameRole.displayRoleState();

        //保存进度
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        //大战boss时，损耗很严重
        gameRole.fight();
        gameRole.displayRoleState();

        //恢复保存的状态
        gameRole.recoveryState(roleStateCaretaker.getRoleStateMemento());
        gameRole.displayRoleState();
    }
}
