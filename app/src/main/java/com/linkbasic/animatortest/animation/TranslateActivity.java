package com.linkbasic.animatortest.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

import com.linkbasic.animatortest.R;

public class TranslateActivity extends AppCompatActivity {
    Button bt_translate, bt_translate2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
        //第一种方式：xml
        bt_translate = (Button) findViewById(R.id.bt_translate);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation_translate);
        bt_translate.startAnimation(animation);

        //第二种方式：动态
        bt_translate2 = (Button) findViewById(R.id.bt_translate2);
        //分别对应xml中的fromXDelta，toXDelta，fromYDelta，toYDelta
        Animation animation2 = new TranslateAnimation(0, 500, 0, 500);
        animation2.setStartOffset(1000);//动画延迟开始时间
        animation2.setDuration(3000);//动画持续时长
        bt_translate2.startAnimation(animation2);
    }
}
