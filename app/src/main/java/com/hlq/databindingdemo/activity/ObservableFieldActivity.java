package com.hlq.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableMap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.hlq.databindingdemo.R;
import com.hlq.databindingdemo.bean.ObservableFieldBean;
import com.hlq.databindingdemo.databinding.ActivityObservableFieldBinding;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/05/08
 * desc   : Observable Field Study
 * version: 1.0
 */
public class ObservableFieldActivity extends AppCompatActivity {

    private ActivityObservableFieldBinding mFieldBinding;

    private ObservableFieldBean mFiledBean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFieldBinding = DataBindingUtil.setContentView(this, R.layout.activity_observable_field);
        initTest();
    }

    private void initTest() {
        mFiledBean = new ObservableFieldBean();
        mFiledBean.filedName.set("贺大大");
        mFiledBean.fileAge.set(22);
        mFiledBean.fileStore.set(true);
        mFieldBinding.setFiledBean(mFiledBean);

        Log.e("HLQ_Struggle", "姓名为：" + mFiledBean.filedName.get());

        ObservableArrayList testList = new ObservableArrayList();
        testList.add("我是第一条数据");
        testList.add("我是第二条数据");
        mFieldBinding.setLoveList(testList);

        ObservableMap<String, String> testMap = new ObservableArrayMap<>();
        testMap.put("name", "贺大宝，心情不美丽");
        testMap.put("age", "22的年龄，啧啧");
        mFieldBinding.setLoveMap(testMap);
    }
}
