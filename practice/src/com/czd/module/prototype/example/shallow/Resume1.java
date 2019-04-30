package com.czd.module.prototype.example.shallow;

/**
 * 简历类
 *
 * @author: czd
 * @create: 2018/3/14 17:03
 */
public class Resume1 implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;
    public Resume1(String name){
        this.name=name;
        work=new WorkExperience();
    }
    //设置个人信息
    public void setPersonalInfo(String age,String sex){
        this.age=age;
        this.sex=sex;
    }
    //设置工作经历
    public void setWorkExperience(String timeArea,String company){
        work.setWorkDate(timeArea);
        work.setCompany(company);
    }
    public void display(){
        System.out.println("个人信息:"+name+":"+age+":"+sex);
        System.out.println("工作经历:"+work.getCompany()+":"+work.getWorkDate());
    }
    @Override
    public Resume1 clone()
    {
        Resume1 o=null;
        try {
             o=(Resume1)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
