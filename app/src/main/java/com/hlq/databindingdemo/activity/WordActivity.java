package com.hlq.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hlq.databindingdemo.R;
import com.hlq.databindingdemo.bean.VVBean;
import com.hlq.databindingdemo.databinding.ActivityWordBinding;

public class WordActivity extends AppCompatActivity {

    private ActivityWordBinding mWordBind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mWordBind = DataBindingUtil.setContentView(this, R.layout.activity_word);
        mWordBind.setVv(new VVBean(true, "程序猿，Oh，程序媛一枚，灵活的双手编织动人的世界~"));
    }
}
