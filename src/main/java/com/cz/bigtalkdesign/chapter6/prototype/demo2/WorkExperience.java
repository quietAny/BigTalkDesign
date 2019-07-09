package com.cz.bigtalkdesign.chapter6.prototype.demo2;

/**
 * @ClassName: WorkExperience
 * @date: 2019/7/4  15:56
 * @author: guohao
 * @Description: 工作经历类
 */
public class WorkExperience implements Cloneable{

    private String timeArea;
    private String company;



    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected Object clone(){

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
