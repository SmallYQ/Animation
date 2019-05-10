package com.linkbasic.animatortest.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

import com.linkbasic.animatortest.R;

public class AnimationSetActivity extends AppCompatActivity {
    Button bt_animation1, bt_animation2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_set);
        //xml
        bt_animation1 = (Button) findViewById(R.id.bt_animation1);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation_set);
        bt_animation1.startAnimation(animation);

        //动态
        bt_animation2 = (Button) findViewById(R.id.bt_animation2);
        AnimationSet animationSet = new AnimationSet(true);
        //子动画一
        Animation animation1 = new AlphaAnimation(0, 1);
        animation1.setDuration(1000);
        //子动画二
        Animation animation2 = new TranslateAnimation(0, 500, 0, 0);
        animation2.setDuration(2000);
        animation2.setStartOffset(3000);
        //子动画三
        Animation animation3 = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation3.setDuration(3000);
        animation3.setRepeatMode(Animation.RESTART);
        animation3.setRepeatCount(Animation.INFINITE);
        //子动画四
        Animation animation4 = new ScaleAnimation(1, 0.5f, 1, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation4.setDuration(3000);
        animation4.setStartOffset(4000);

        animationSet.addAnimation(animation1);
        animationSet.addAnimation(animation2);
        animationSet.addAnimation(animation3);
        animationSet.addAnimation(animation4);
        bt_animation2.startAnimation(animationSet);
    }
}
