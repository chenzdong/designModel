package com.czd.module.prototype.example.deep;

/**
 * 工作经历类
 *
 * @author: czd
 * @create: 2018/3/15 10:33
 */
public class WorkExperience2 implements  Cloneable{
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    @Override
    protected Object clone() {
        WorkExperience2 work=null;
        try {
            work= (WorkExperience2) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return work;

    }

    public void setCompany(String company) {

        this.company = company;
    }
}
