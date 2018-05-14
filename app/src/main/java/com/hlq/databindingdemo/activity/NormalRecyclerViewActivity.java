package com.hlq.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import com.hlq.databindingdemo.R;
import com.hlq.databindingdemo.adapter.ShowListAdapter;
import com.hlq.databindingdemo.bean.UserBean;
import com.hlq.databindingdemo.databinding.ActivityNormalRecyclerViewBinding;

import java.util.ArrayList;
import java.util.List;

public class NormalRecyclerViewActivity extends AppCompatActivity {

    private ActivityNormalRecyclerViewBinding mNormalBinding;
    private ShowListAdapter mShowListAdapter;
    private List<UserBean> mShowList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNormalBinding = DataBindingUtil.setContentView(this, R.layout.activity_normal_recycler_view);
        initData();
        initRecyclerViewSetting();
    }

    private void initData() {
        mShowList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            mShowList.add(new UserBean("贺大大" + i));
        }
    }

    private void initRecyclerViewSetting() {
        mNormalBinding.showList.setLayoutManager(new LinearLayoutManager(this));
        mShowListAdapter = new ShowListAdapter(this, mShowList);
        mShowListAdapter.setOnItemClickListener(new ShowListAdapter.onItemClickListener() {
            @Override
            public void onItemClickListener(UserBean userBean) {
                Toast.makeText(NormalRecyclerViewActivity.this, "点击了：" + userBean.getUserName(), Toast.LENGTH_SHORT).show();
            }
        });
        mNormalBinding.showList.setAdapter(mShowListAdapter);
    }
}
