package com.linkbasic.animatortest.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;

import com.linkbasic.animatortest.R;

public class RotateActivity extends AppCompatActivity {
    Button bt_rotate1, bt_rotate2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
        //xml
        bt_rotate1 = (Button) findViewById(R.id.bt_rotate1);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation_rotate);
        bt_rotate1.startAnimation(animation);
        //动态

        bt_rotate2 = (Button) findViewById(R.id.bt_rotate2);
        //参数分别对应fromDegrees，toDegrees，旋转轴点X坐标类型，pivotX，旋转轴点Y坐标类型，pivotY
        Animation animation2 = new RotateAnimation(0, -360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation2.setStartOffset(1000);
        animation2.setDuration(3000);
        bt_rotate2.startAnimation(animation2);
    }
}
