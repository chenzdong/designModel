package com.czd.module.parctice;

/**
 * 原型类
 *
 * @author: czd
 * @create: 2018/3/14 11:16
 */
public class Worker {

    private String name;

    private String age;

    private String sex;

    public Worker(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
