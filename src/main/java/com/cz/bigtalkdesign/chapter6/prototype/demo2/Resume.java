package com.cz.bigtalkdesign.chapter6.prototype.demo2;

/**
 * @ClassName: Resume
 * @date: 2019/7/4  15:39
 * @author: guohao
 * @Description: 简历类
 */
public class Resume implements Cloneable{

    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    private Resume(WorkExperience workExperience) {
        this.workExperience = (WorkExperience)workExperience.clone();
    }

    /**
     * 设置个人信息
     * @param sex
     * @param age
     */
    public void setPersonalInfof(String sex,String age){
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     * @param timeArea
     * @param company
     */
    public void setWorkExperience(String timeArea,String company){
        workExperience.setCompany(company);
        workExperience.setTimeArea(timeArea);
    }

    /**
     * 展示
     */
    public void disPlay(){
        System.out.println(name +","+ sex +"," + age);
        System.out.println("工作经历：" +  workExperience.getTimeArea() + "," + workExperience.getCompany());
    }

    /**
     * 克隆方法
     * @return
     */
    @Override
    protected Object clone(){

        Resume resume = new Resume(this.workExperience);
        resume.setAge(this.age);
        resume.setName(this.name);
        resume.setSex(this.sex);
        return resume;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
