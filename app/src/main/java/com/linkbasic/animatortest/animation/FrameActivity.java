package com.linkbasic.animatortest.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.linkbasic.animatortest.R;

public class FrameActivity extends AppCompatActivity {
    Button bt_start, bt_stop;
    ImageView iv;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        bt_start = (Button) findViewById(R.id.bt_start);
        bt_stop = (Button) findViewById(R.id.bt_stop);
        iv = (ImageView) findViewById(R.id.iv);
        iv.setImageResource(R.drawable.frame_list);
        animationDrawable = (AnimationDrawable) iv.getDrawable();
        bt_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //启动帧动画
                animationDrawable.start();
            }
        });
        bt_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //暂停帧动画
                animationDrawable.stop();
            }
        });
    }
}
