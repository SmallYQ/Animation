package com.linkbasic.animatortest.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.linkbasic.animatortest.R;

public class AlphaActivity extends AppCompatActivity {
    Button bt_alpha1, bt_alpha2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        //xml
        bt_alpha1 = (Button) findViewById(R.id.bt_alpha1);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation_alpha);
        bt_alpha1.startAnimation(animation);
        //动态
        bt_alpha2 = (Button) findViewById(R.id.bt_alpha2);
        //参数分别对应fromAlpha，toAlpha
        Animation animation2 = new AlphaAnimation(0, 1);
        animation2.setStartOffset(1000);
        animation2.setDuration(3000);
        bt_alpha2.startAnimation(animation2);
        animation2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
