package com.linkbasic.animatortest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.linkbasic.animatortest.animation.AnimationSetActivity;
import com.linkbasic.animatortest.animation.FrameActivity;
import com.linkbasic.animatortest.animator.ObjectAnimator2Activity;
import com.linkbasic.animatortest.animator.ObjectAnimatorActivity;
import com.linkbasic.animatortest.animator.ValueAnimator2Activity;
import com.linkbasic.animatortest.animator.ValueAnimatorActivity;

public class MainActivity extends AppCompatActivity {
    Button bt_frame, bt_animation, bt_animator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_frame = (Button) findViewById(R.id.bt_frame);
        bt_animation = (Button) findViewById(R.id.bt_animation);
        bt_animator = (Button) findViewById(R.id.bt_animator);
        bt_frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FrameActivity.class);
                startActivity(intent);
            }
        });
        bt_animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnimationSetActivity.class);
                startActivity(intent);
            }
        });
        bt_animator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ObjectAnimator2Activity.class);
                startActivity(intent);
            }
        });
    }
}
