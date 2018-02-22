package com.hlq.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hlq.databindingdemo.R;
import com.hlq.databindingdemo.bean.UserBean;
import com.hlq.databindingdemo.databinding.ActivityExpressionBinding;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/21
 * desc   : Data Binding 表达式 Study
 * version: 1.0
 */
public class ExpressionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityExpressionBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_expression);
        binding.setUser(new UserBean("贺大大", "22", "河北", 0));
    }
}
