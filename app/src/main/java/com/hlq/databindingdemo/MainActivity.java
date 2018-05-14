package com.hlq.databindingdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hlq.databindingdemo.activity.BasisUsageActivity;
import com.hlq.databindingdemo.activity.BindListenerActivity;
import com.hlq.databindingdemo.activity.ExpressionActivity;
import com.hlq.databindingdemo.activity.IncludeActivity;
import com.hlq.databindingdemo.activity.NormalRecyclerViewActivity;
import com.hlq.databindingdemo.activity.ObservableActivity;
import com.hlq.databindingdemo.activity.ObservableFieldActivity;
import com.hlq.databindingdemo.activity.RecyclerViewActivity;
import com.hlq.databindingdemo.activity.ViewStubActivity;
import com.hlq.databindingdemo.databinding.ActivityMainBinding;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/22
 * desc   : 首页导航
 * version: 1.0
 */
public class MainActivity extends AppCompatActivity {

    private MainActivity selfActivity = MainActivity.this;

    private ActivityMainBinding mainDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainDataBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainDataBinding.setPersenter(new Presenter());
    }

    // 方法引用 必须使用listener本身的格式
    public class Presenter {
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
                case R.id.useViewStub: // ViewStub Study
                    startActivity(new Intent(selfActivity, ViewStubActivity.class));
                    break;
                case R.id.useInclude: // include Study
                    startActivity(new Intent(selfActivity, IncludeActivity.class));
                    break;
                case R.id.updateData: // 数据更新
                    startActivity(new Intent(selfActivity, ObservableActivity.class));
                    break;
                case R.id.observableFieldStudy: // observable Field Study
                    startActivity(new Intent(selfActivity, ObservableFieldActivity.class));
                    break;
                case R.id.showLoveHistory: // 展示RecyclerView如何使用DataBinding
                    startActivity(new Intent(selfActivity, RecyclerViewActivity.class));
                    break;
                case R.id.showLoveHistoryOnClick: // 展示RecyclerView添加点击事件
                    startActivity(new Intent(selfActivity, RecyclerViewActivity.class));
                    break;
                case R.id.normalRecyclerView: // 换一种方式实现RecyclerView
                    startActivity(new Intent(selfActivity, NormalRecyclerViewActivity.class));
                    break;
            }
        }
    }

}
