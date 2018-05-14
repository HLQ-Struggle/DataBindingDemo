package com.hlq.databindingdemo.util;

import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.hlq.databindingdemo.adapter.ShowLoveHistoryAdapter;
import com.hlq.databindingdemo.bean.LoveBean;

import java.util.List;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/24
 * desc   : 桥接RecyclerView与Data Binding
 * version: 1.0
 */
public class BindUtils {

    @BindingAdapter("data")
    public static void setShowLoveHistoryData(final RecyclerView recyclerView,
                                              List<LoveBean> loveList) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        ShowLoveHistoryAdapter adapter = new ShowLoveHistoryAdapter(recyclerView.getContext(), loveList);
        adapter.setOnItemClickListener(new ShowLoveHistoryAdapter.OnItemClickListener() {
            @Override
            public void OnItemClickListener(LoveBean loveBean) {
                Toast.makeText(recyclerView.getContext(), "点击了：" + loveBean.getYouSelf(), Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);
    }

}
