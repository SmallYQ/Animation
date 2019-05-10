package com.linkbasic.animatortest.animator;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.linkbasic.animatortest.R;

public class ObjectAnimatorActivity extends AppCompatActivity {
    Button bt_alpha, bt_translate, bt_scale, bt_rotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);

        bt_alpha = (Button) findViewById(R.id.bt_alpha);
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(bt_alpha, "alpha", 0, 1);
        objectAnimator.setDuration(3000);
        objectAnimator.start();

        bt_translate = (Button) findViewById(R.id.bt_translate);
        ObjectAnimator.ofFloat(bt_translate, "translationX", bt_translate.getTranslationX(), 300, bt_translate.getTranslationX()).setDuration(3000).start();


        bt_scale = (Button) findViewById(R.id.bt_scale);
        ObjectAnimator.ofFloat(bt_scale, "scaleX", 0, 2, 1).setDuration(3000).start();

        bt_rotate = (Button) findViewById(R.id.bt_rotate);
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(bt_rotate, "rotationY", 0, 360).setDuration(3000);
        objectAnimator2.setRepeatCount(ValueAnimator.INFINITE);
        objectAnimator2.start();
    }
}
