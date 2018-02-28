package com.hlq.databindingdemo.util;

import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hlq.databindingdemo.adapter.ShowLoveHistoryAdapter;
import com.hlq.databindingdemo.bean.LoveBean;

import java.util.List;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/24
 * desc   :
 * version: 1.0
 */
public class BindUtils {

    @BindingAdapter("data")
    public static void setShowLoveHistoryData(RecyclerView recyclerView,
                                              List<LoveBean> loveList) {
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new ShowLoveHistoryAdapter(recyclerView.getContext(), loveList));
    }

}
