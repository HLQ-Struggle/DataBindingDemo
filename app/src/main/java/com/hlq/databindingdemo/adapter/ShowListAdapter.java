package com.hlq.databindingdemo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hlq.databindingdemo.R;
import com.hlq.databindingdemo.bean.UserBean;
import com.hlq.databindingdemo.databinding.ItemShowListBinding;

import java.util.List;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/05/09
 * desc   :
 * version: 1.0
 */
public class ShowListAdapter extends RecyclerView.Adapter<ShowListAdapter.ViewHolder> {

    private Context mContext;
    private List<UserBean> mUserBeanList;
    private onItemClickListener mOnItemClickListener;
    private ItemShowListBinding mListBinding;

    public ShowListAdapter(Context context, List<UserBean> userBeanList) {
        this.mContext = context;
        this.mUserBeanList = userBeanList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mListBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.item_show_list, parent, false);
        return new ViewHolder(mListBinding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // 传递Model
        holder.mListBinding.setUser(mUserBeanList.get(position));
        // 刷新RecyclerView
        holder.mListBinding.executePendingBindings();
        // 设置事件 只需要传递当前item所需Model(Java Bean)即可
        if (mOnItemClickListener != null) {
            holder.mListBinding.parentList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnItemClickListener.onItemClickListener(mUserBeanList.get(position));
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mUserBeanList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ItemShowListBinding mListBinding;

        public ViewHolder(ItemShowListBinding listBinding) {
            super(listBinding.getRoot());
            this.mListBinding = listBinding;
        }
    }

    public void setOnItemClickListener(onItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public interface onItemClickListener {

        void onItemClickListener(UserBean userBean);

    }

}
