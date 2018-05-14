package com.hlq.databindingdemo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hlq.databindingdemo.R;
import com.hlq.databindingdemo.bean.LoveBean;
import com.hlq.databindingdemo.databinding.ItemLoveHistoryShowBinding;
import com.hlq.databindingdemo.holder.ShowLoveHistoryHolder;

import java.util.List;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/02/24
 * desc   : RecyclerView与DataBinding使用
 * version: 1.0
 */
public class ShowLoveHistoryAdapter extends RecyclerView.Adapter<ShowLoveHistoryHolder> {

    private Context mContext;
    private List<LoveBean> mLoveList;
    private OnItemClickListener mOnItemClickListener;

    public ShowLoveHistoryAdapter(Context mContext, List<LoveBean> mLoveList) {
        this.mContext = mContext;
        this.mLoveList = mLoveList;
    }

    @Override
    public ShowLoveHistoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemLoveHistoryShowBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(mContext),
                R.layout.item_love_history_show,
                parent, false);
        return new ShowLoveHistoryHolder(binding);
    }

    @Override
    public void onBindViewHolder(ShowLoveHistoryHolder holder, final int position) {
        holder.getBinding().setLove(mLoveList.get(position));
        // 立即刷新界面，防止列表更新不及时，导致数据错乱
        holder.getBinding().executePendingBindings();
        if (mOnItemClickListener != null) {
            holder.getBinding().icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.OnItemClickListener(mLoveList.get(position));
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mLoveList == null ? 0 : mLoveList.size();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {

        void OnItemClickListener(LoveBean loveBean);

    }

}
