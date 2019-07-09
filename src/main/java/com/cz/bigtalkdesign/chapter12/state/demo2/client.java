package com.cz.bigtalkdesign.chapter12.state.demo2;

/**
 * @ClassName: client
 * @date: 2019/7/5  11:09
 * @author: guohao
 * @Description: 客户端
 */
public class client {

    public static void main(String[] args) {
        //紧急项目
        Worker emergencyProject = new Worker();
        emergencyProject.setHour(9);
        emergencyProject.work();
        emergencyProject.setHour(10);
        emergencyProject.work();
        emergencyProject.setHour(12);
        emergencyProject.work();
        emergencyProject.setHour(13);
        emergencyProject.work();
        emergencyProject.setHour(14);
        emergencyProject.work();
        emergencyProject.setHour(17);
        emergencyProject.work();

        //emergencyProject.setFinish(true);
        emergencyProject.setFinish(false);
        emergencyProject.setHour(19);
        emergencyProject.work();
        emergencyProject.setHour(22);
        emergencyProject.work();
    }
}
