package com.hlq.databindingdemo.util;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * author : HLQ
 * e-mail : 925954424@qq.com
 * time   : 2018/05/16
 * desc   : Fuck Code Fuck Fuck Fuck
 * version: 1.0
 */
public class ImageUtils {

    @BindingAdapter("imageResource")
    public static void setImageResource(
            ImageView imageView,
            int imgID) {
        imageView.setImageResource(imgID);
    }

    @BindingAdapter("imageDrawable")
    public static void setImageDrawable(
            ImageView imageView,
            Drawable imgDrawable) {
        imageView.setImageDrawable(imgDrawable);
    }

    @BindingAdapter({"defaultImg", "loadingImg", "errorImg"})
    public static void setImageForGlide(
            ImageView imageView,
            Drawable defaultImg,
            String imageAddress,
            Drawable errorImg) {
        Glide.with(imageView.getContext())
                .load(imageAddress)
                .error(errorImg)
                .placeholder(defaultImg)
                .into(imageView);
    }


}
