package com.czd.module.prototype.example.common;

/**
 * 简历类
 *
 * @author: czd
 * @create: 2018/3/14 17:03
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;
    public Resume(String name){
        this.name=name;
    }
    //设置个人信息
    public void setPersonalInfo(String age,String sex){
        this.age=age;
        this.sex=sex;
    }
    //设置工作经历
    public void setWorkExperience(String timeArea,String company){
        this.timeArea=timeArea;
        this.company=company;
    }
    public void display(){
        System.out.println("个人信息: "+name+":"+age+":"+sex);
        System.out.println("工作经历: "+timeArea+":"+company);
    }
    @Override
    public Resume clone()
    {
        Resume o=null;
        try {
             o=(Resume)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
