package com.hlq.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.hlq.databindingdemo.R;
import com.hlq.databindingdemo.bean.UserBean;
import com.hlq.databindingdemo.databinding.ActivityBindListenerBinding;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/13
 * desc   : 事件绑定
 * version: 1.0
 */
public class BindListenerActivity extends AppCompatActivity {

    private BindListenerActivity selfActivity = BindListenerActivity.this;

    private ActivityBindListenerBinding mBindListenerBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBindListenerBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_bind_listener);
        mBindListenerBinding.setPersenter(new Presenter());
//        mBindListenerBinding.setVariable(BR.persenter,new Persenter());

        mBindListenerBinding.setUser(new UserBean("贺大大", "22", "China"));
    }

    public class Presenter {
        public void onClick(View view) {
            Toast.makeText(selfActivity, "点到了哦~", Toast.LENGTH_SHORT).show();
        }

        public void getUserClick() {
            Toast.makeText(selfActivity, "有人在呼唤你~", Toast.LENGTH_SHORT).show();
        }

        public void showUserName(UserBean userBean) {
            Toast.makeText(selfActivity, "看看是谁:" + userBean.getUserName(), Toast.LENGTH_SHORT).show();
        }
    }

}
