package com.wp.annotationscan.entity;

import com.wp.annotationscan.annotation.RequiredMe;

/**
 * @author WangPeng
 * @ClassName: Student
 * @Description: 用于测试
 * @Package com.wp.annotationscan.entity
 * @date 2018/11/1
 */
public class Student {
    @RequiredMe
    private String name;
    @RequiredMe
    private String age;
    @RequiredMe
    private String gender;


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

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

}
