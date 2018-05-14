package com.hlq.databindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/22
 * desc   : notifyChange 更新所有数据
 * version: 1.0
 */
public class LoveBean extends BaseObservable {

    private String youSelf;
    private String mySelf;
    private ObservableBoolean isTrueLove = new ObservableBoolean();

    public LoveBean( String youSelf, String mySelf, boolean trueLove) {
        this.youSelf = youSelf;
        this.mySelf = mySelf;
        isTrueLove.set(trueLove);
    }

    public String getYouSelf() {
        return youSelf;
    }

    public void setYouSelf(String youSelf) {
        this.youSelf = youSelf;
    }

    public String getMySelf() {
        return mySelf;
    }

    public void setMySelf(String mySelf) {
        this.mySelf = mySelf;
    }

    public ObservableBoolean getIsTrueLove() {
        return isTrueLove;
    }

    public void setIsTrueLove(boolean isTrueLove) {
        this.isTrueLove.set(isTrueLove);
        notifyChange();
    }
}
