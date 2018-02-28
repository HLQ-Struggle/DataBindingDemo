package com.hlq.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hlq.databindingdemo.R;
import com.hlq.databindingdemo.bean.LoveBean;
import com.hlq.databindingdemo.databinding.ActivityRecyclerViewBinding;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/23
 * desc   : RecyclerView与DataBinding使用
 * version: 1.0
 */
public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerViewBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
        ObservableArrayList<LoveBean> loveList = new ObservableArrayList<>();
        for (int i = 0; i < 30; i++) {
            loveList.add(new LoveBean("youSelf" + i, "mySelf" + i, true));
        }
        binding.setLoveList(loveList);
    }
}
