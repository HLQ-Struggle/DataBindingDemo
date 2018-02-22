package com.hlq.databindingdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hlq.databindingdemo.activity.BasisUsageActivity;
import com.hlq.databindingdemo.activity.BindListenerActivity;
import com.hlq.databindingdemo.activity.ExpressionActivity;
import com.hlq.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private MainActivity selfActivity = MainActivity.this;

    private ActivityMainBinding mainDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainDataBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainDataBinding.setPersenter(new Persenter());
    }

    // 方法引用 必须使用listener本身的格式
    public class Persenter {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.bindData: // 数据绑定
                    startActivity(new Intent(selfActivity, BasisUsageActivity.class));
                    break;
                case R.id.bingListener: // 设置(绑定)事件
                    startActivity(new Intent(selfActivity, BindListenerActivity.class));
                    break;
                case R.id.useExpression: // 表达式
                    startActivity(new Intent(selfActivity, ExpressionActivity.class));
                    break;
            }
        }
    }

}
