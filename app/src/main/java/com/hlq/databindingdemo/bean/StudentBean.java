package com.hlq.databindingdemo.bean;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/12
 * desc   :
 * version: 1.0
 */
public class StudentBean {

    private String stuName;
    private int stuAge;
    private boolean stuIsPer;

    public boolean isStuIsPer() {
        return stuIsPer;
    }

    public void setStuIsPer(boolean stuIsPer) {
        this.stuIsPer = stuIsPer;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public StudentBean() {
    }

    public StudentBean(String stuName) {
        this.stuName = stuName;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}
