package com.linkbasic.animatortest.animator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.Button;

import com.linkbasic.animatortest.R;

public class ObjectAnimator2Activity extends AppCompatActivity {
    Button bt, bt2, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator2);

        bt = (Button) findViewById(R.id.bt);
        ViewWrapper viewWrapper = new ViewWrapper(bt);
        ObjectAnimator animator = ObjectAnimator.ofInt(viewWrapper, "width", 0, 500);
        animator.setDuration(3000);
        animator.start();
        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
            }
        });

        bt2 = (Button) findViewById(R.id.bt2);
        //子动画一
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(bt2, "alpha", 0, 1);
        objectAnimator.setDuration(2000);
        //子动画二
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(bt2, "translationX", 0, 300);
        objectAnimator2.setDuration(3000);
        //子动画三
        ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat(bt2, "rotation", 0, 360);
        objectAnimator3.setDuration(3000);
        //子动画四
        ObjectAnimator objectAnimator4 = ObjectAnimator.ofFloat(bt2, "scaleX", 1, 0.5f);
        objectAnimator4.setDuration(3000);
        //子动画五
        ObjectAnimator objectAnimator5 = ObjectAnimator.ofFloat(bt2, "scaleY", 1, 0.5f);
        objectAnimator5.setDuration(3000);

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimator2).with(objectAnimator3).with(objectAnimator4).with(objectAnimator5).after(objectAnimator).after(1000);
        animatorSet.start();


        bt3 = (Button) findViewById(R.id.bt3);
//        bt3.animate().alpha(0).setDuration(3000);//透明度由原来变为0
//        bt3.animate().translationX(300).setDuration(3000);//平移
//        bt3.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);//X,Y缩放为原来0.5
        bt3.animate().rotation(360).setDuration(3000);//顺时针旋转360度
    }

    public class ViewWrapper {
        View view;

        public ViewWrapper(View view) {
            this.view = view;
        }

        //得到控件的宽度
        public int getWidth() {
            return view.getLayoutParams().width;
        }

        //设置控件的宽度
        public void setWidth(int width) {
            view.getLayoutParams().width = width;
            view.requestLayout();
        }
    }
}
