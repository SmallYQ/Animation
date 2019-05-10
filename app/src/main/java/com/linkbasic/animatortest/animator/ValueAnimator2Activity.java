package com.linkbasic.animatortest.animator;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.linkbasic.animatortest.R;

public class ValueAnimator2Activity extends AppCompatActivity {
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animator2);
        bt = (Button) findViewById(R.id.bt);
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(500, 500);
        ValueAnimator valueAnimator = ValueAnimator.ofObject(new PointEvaluator(), startPoint, endPoint);
        valueAnimator.setDuration(3000);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Point currentPoint = (Point) valueAnimator.getAnimatedValue();
                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(bt.getLayoutParams());
                lp.setMargins(currentPoint.getX(), currentPoint.getY(), 0, 0);
                bt.setLayoutParams(lp);
                bt.requestLayout();
            }
        });
        valueAnimator.start();
    }
}
