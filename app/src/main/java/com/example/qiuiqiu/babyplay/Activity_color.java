package com.example.qiuiqiu.babyplay;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ViewFlipper;

/**
 * Created by qiuiqiu on 2015/12/21.
 */
public class Activity_color extends Activity implements GestureDetector.OnGestureListener ,View.OnTouchListener {
    private ViewFlipper myViewFlipper;
    private GestureDetector myGestureDetector;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.box);
        LayoutInflater factory = LayoutInflater.from(Activity_color.this);
        View first = factory.inflate(R.layout.color_pink, null);
        View second = factory.inflate(R.layout.color_red, null);
        View third = factory.inflate(R.layout.color_yellow, null);
        myViewFlipper = (ViewFlipper) findViewById(R.id.myViewFlipper);
        myViewFlipper.addView(first);
        myViewFlipper.addView(second);
        myViewFlipper.addView(third);
        myGestureDetector = new GestureDetector(this);
        myViewFlipper.setLongClickable(true);
        myViewFlipper.setOnTouchListener(this);
    }


    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    // 实现OnFling方法，就可以利用滑动的起始坐标识别出左右滑动的手势，并处理
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                           float velocityY) {
        // 参数e1是按下事件，e2是放开事件，剩下两个是滑动的速度分量，这里用不到
        // 按下时的横坐标大于放开时的横坐标，从右向左滑动
        if (e1.getX() > e2.getX()) {
            myViewFlipper.showNext();
        }
        // 按下时的横坐标小于放开时的横坐标，从左向右滑动
        else if (e1.getX() < e2.getX()) {
            myViewFlipper.showPrevious();
        }
        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return myGestureDetector.onTouchEvent(event);
    }
}

