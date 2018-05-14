package com.hlq.databindingdemo.holder;

import android.support.v7.widget.RecyclerView;

import com.hlq.databindingdemo.databinding.ItemLoveHistoryShowBinding;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/24
 * desc   : RecyclerView 所需Holder
 * version: 1.0
 */
public class ShowLoveHistoryHolder extends RecyclerView.ViewHolder {

    private ItemLoveHistoryShowBinding binding;

    public ShowLoveHistoryHolder(ItemLoveHistoryShowBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public ItemLoveHistoryShowBinding getBinding() {
        return binding;
    }

    public void setBinding(ItemLoveHistoryShowBinding binding) {
        this.binding = binding;
    }

}
