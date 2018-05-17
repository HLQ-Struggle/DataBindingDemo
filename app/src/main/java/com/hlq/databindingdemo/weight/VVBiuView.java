package com.hlq.databindingdemo.weight;

import android.content.Context;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.Toast;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/05/17
 * desc   : 大招类 主动激活 则将薇薇轰上天~！！！
 * version: 1.0
 */
@BindingMethods(
        @BindingMethod(
                type = AppCompatTextView.class, // 目标
                attribute = "activation", // 激活方式
                method = "setActivation" // 激活后链接自动释放大招
        )
)
public class VVBiuView extends AppCompatTextView {

    public VVBiuView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 主动激活技能，将薇薇轰上天~
     *
     * @param msg
     */
    public void setActivation(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

}
