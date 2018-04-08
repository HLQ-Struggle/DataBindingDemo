package com.hlq.databindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.hlq.databindingdemo.BR;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/22
 * desc   : BaseObservable 学习了解
 * version: 1.0
 */
public class ClassBean extends BaseObservable {

    private String classNo;
    private String classNum;
    private String className;

    public ClassBean(String className) {
        this.className = className;
    }

    public ClassBean(String className, String classNum) {
        this.className = className;
        this.classNum = classNum;
    }

    public ClassBean(String classNo, String classNum, String className) {
        this.classNo = classNo;
        this.classNum = classNum;
        this.className = className;
    }

    @Bindable
    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
        notifyPropertyChanged(BR.classNo);
    }

    @Bindable
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
        notifyPropertyChanged(BR.className);
    }

    @Bindable
    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
        notifyPropertyChanged(BR.classNum);
    }
}
