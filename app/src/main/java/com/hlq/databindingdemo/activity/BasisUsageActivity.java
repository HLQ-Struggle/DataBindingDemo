package com.hlq.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hlq.databindingdemo.R;
import com.hlq.databindingdemo.bean.StudentBean;
import com.hlq.databindingdemo.bean.UserBean;
import com.hlq.databindingdemo.databinding.ActivityBasisUsageBinding;

/**
 * 基础 nice easy用法
 */
public class BasisUsageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 实例化布局 初始化Binding
        ActivityBasisUsageBinding basisUsageBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_basis_usage);
        // 设置值
        basisUsageBinding.userName.setText("静心Study");
        basisUsageBinding.userAge.setText("22");
        basisUsageBinding.userAddress.setText("大好河山，张家口");

        UserBean userBean = new UserBean("HLQ_Struggle", "XML绑定年龄：22", "XML直接绑定地址");
        basisUsageBinding.setUser(userBean);
        basisUsageBinding.setStu(new StudentBean());

    }

}
