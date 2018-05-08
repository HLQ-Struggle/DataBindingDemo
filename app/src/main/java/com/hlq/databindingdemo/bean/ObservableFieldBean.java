package com.hlq.databindingdemo.bean;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/05/08
 * desc   : Observable Field 实体类
 * version: 1.0
 */
public class ObservableFieldBean {

    public ObservableField<String> filedName = new ObservableField<>();
    public ObservableInt fileAge = new ObservableInt();
    public ObservableBoolean fileStore = new ObservableBoolean();

}
