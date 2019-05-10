package com.linkbasic.animatortest.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;

import com.linkbasic.animatortest.R;

public class ScaleActivity extends AppCompatActivity {
    Button bt_scale1, bt_scale2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);
        //xml方式
        bt_scale1 = (Button) findViewById(R.id.bt_scale1);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation_scale);
        bt_scale1.startAnimation(animation);

        //动态
        bt_scale2 = (Button) findViewById(R.id.bt_scale2);
        //参数分别对应fromXScale，toXScale，fromYScale，toYScale，缩放轴点X坐标类型，pivotX，缩放轴点Y坐标类型，pivotY
        Animation animation2 = new ScaleAnimation(0, 2, 0, 2, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation2.setStartOffset(1000);
        animation2.setDuration(3000);
        bt_scale2.startAnimation(animation2);
    }
}
