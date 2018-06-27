package com.czd.module.prototype.example.deep;

/**
 * 简历类
 *
 * @author: czd
 * @create: 2018/3/14 17:03
 */
public class Resume2 implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience2 work;
    public Resume2(String name){
        this.name=name;
        work=new WorkExperience2();
    }

    private Resume2(WorkExperience2 workExperience){
        this.work= (WorkExperience2) workExperience.clone();
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
        System.out.println("个人信息:"+name+age+sex);
        System.out.println("工作经历:"+work.getCompany()+work.getWorkDate());
    }
    @Override
    public Resume2 clone()
    {
        Resume2 resume2=new Resume2(this.work);
        resume2.name=this.name;
        resume2.sex=this.sex;
        resume2.age=this.age;
        return resume2;
    }
}
