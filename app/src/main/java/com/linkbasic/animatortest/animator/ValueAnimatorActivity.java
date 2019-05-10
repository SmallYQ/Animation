package com.linkbasic.animatortest.animator;

import android.animation.ValueAnimator;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.linkbasic.animatortest.R;

public class ValueAnimatorActivity extends AppCompatActivity {
    Button bt_value1, bt_value2, bt_value3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animator);
        bt_value1 = (Button) findViewById(R.id.bt_value1);
        //步骤1.创建动画实例，将传入的多个Int参数进行平滑过渡，这里只有两个int参数，可以有多个
        ValueAnimator valueAnimator = ValueAnimator.ofInt(bt_value1.getLayoutParams().width, 500);
        //步骤2.设置动画的播放各种属性，如动画运行的时长setDuration，动画延迟播放时间setStartDelay，动画重复播放次数setRepeatCount，重复播放动画模式setRepeatMode
        valueAnimator.setDuration(3000);
        //步骤3.将改变的值手动赋值给对象的属性值：通过动画的更新监听器，值每次改变、变化一次,该方法就会被调用一次
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int currentValue = (int) valueAnimator.getAnimatedValue();
                bt_value1.getLayoutParams().width = currentValue;//将当前的值给button作为宽度
                bt_value1.requestLayout();//对button进行重新绘制
            }
        });
        //步骤4.开启动画
        valueAnimator.start();


        bt_value2 = (Button) findViewById(R.id.bt_value2);
        ValueAnimator valueAnimator2 = ValueAnimator.ofInt(0, 300);
        valueAnimator2.setDuration(3000);
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int currentMargin = (int) valueAnimator.getAnimatedValue();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(bt_value2.getLayoutParams());
                layoutParams.setMargins(currentMargin, 0, 0, 0);
                bt_value2.setLayoutParams(layoutParams);
            }
        });
        valueAnimator2.start();


        bt_value3 = (Button) findViewById(R.id.bt_value3);
        ValueAnimator valueAnimator3 = ValueAnimator.ofFloat(0, 1);
        valueAnimator3.setDuration(3000);
        valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float currentValue = (float) valueAnimator.getAnimatedValue();
                bt_value3.setAlpha(currentValue);
                bt_value3.requestLayout();
            }
        });
        valueAnimator3.start();
    }
}
