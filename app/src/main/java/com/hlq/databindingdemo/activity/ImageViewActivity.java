package com.hlq.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hlq.databindingdemo.R;
import com.hlq.databindingdemo.bean.ImageBean;
import com.hlq.databindingdemo.databinding.ActivityImageViewBinding;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/05/15
 * desc   : 当Data Binding遇到ImageView
 * version: 1.0
 */
public class ImageViewActivity extends AppCompatActivity {

    private ActivityImageViewBinding mImageBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mImageBinding = DataBindingUtil.setContentView(this, R.layout.activity_image_view);
        ImageBean imageBean = new ImageBean();
        imageBean.imageResID = R.drawable.ic_launcher_round;
        imageBean.imgUrl = "http://d.hiphotos.baidu.com/image/pic/item/6159252dd42a2834171827b357b5c9ea14cebfcf.jpg";
        mImageBinding.setImage(imageBean);
    }
}
