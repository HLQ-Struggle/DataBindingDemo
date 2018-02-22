package com.hlq.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hlq.databindingdemo.R;
import com.hlq.databindingdemo.bean.UserBean;
import com.hlq.databindingdemo.databinding.ActivityIncludeBinding;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/22
 * desc   : include 导入
 * version: 1.0
 */
public class IncludeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityIncludeBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_include);
        binding.setUser(new UserBean("静心Study", "22", "帝都"));
    }
}
