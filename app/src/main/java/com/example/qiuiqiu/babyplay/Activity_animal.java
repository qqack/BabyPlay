package com.example.qiuiqiu.babyplay;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * Created by qiuiqiu on 2015/12/21.
 */
public class Activity_animal extends Activity implements GestureDetector.OnGestureListener ,View.OnTouchListener{
    private ViewFlipper myViewFlipper;
    private GestureDetector myGestureDetector;
    private MediaPlayer mpCat_py;
    private MediaPlayer mpCat_eg;
    private TextView textview_catPy;
    private TextView textview_catEg;
    private ImageView img_cat;
    private ImageView img_dog;
    private MediaPlayer mpDog_py;
    private MediaPlayer mpDog_eg;
    private TextView textview_dogPy;
    private TextView textview_dogEg;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.box);
        LayoutInflater factory = LayoutInflater.from(Activity_animal.this);
        View first = factory.inflate(R.layout.animal_cat, null);
        View second = factory.inflate(R.layout.animal_dog, null);
        View third = factory.inflate(R.layout.animal_cattle, null);
        View four = factory.inflate(R.layout.animal_chicken, null);
        View five = factory.inflate(R.layout.animal_pig, null);
        myViewFlipper = (ViewFlipper) findViewById(R.id.myViewFlipper);
        myViewFlipper.addView(first);
        myViewFlipper.addView(second);
        myViewFlipper.addView(third);
        myViewFlipper.addView(four);
        myViewFlipper.addView(five);
        myGestureDetector = new GestureDetector(this);
        myViewFlipper.setLongClickable(true);
        myViewFlipper.setOnTouchListener(this);
        textview_catPy = (TextView) findViewById(R.id.cat_py);
        textview_catEg = (TextView) findViewById(R.id.cat_eg);
        img_cat = (ImageView) findViewById(R.id.animal_cat);
        mpCat_py= new MediaPlayer();
        mpCat_py=MediaPlayer.create(this, R.raw.cat_py);
        mpCat_eg= new MediaPlayer();
        mpCat_eg=MediaPlayer.create(this, R.raw.cat_eg);
        img_cat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try {
                    if (mpCat_py != null) {
                        mpCat_py.stop();
                    }
                    mpCat_py.prepare();
                    mpCat_py.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        textview_catPy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try {
                    if (mpCat_py != null) {
                        mpCat_py.stop();
                    }
                    mpCat_py.prepare();
                    mpCat_py.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        textview_catEg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try {
                    if (mpCat_eg != null) {
                        mpCat_eg.stop();
                    }
                    mpCat_eg.prepare();
                    mpCat_eg.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        textview_dogPy = (TextView) findViewById(R.id.dog_py);
        textview_dogEg = (TextView) findViewById(R.id.dog_eg);
        img_dog = (ImageView) findViewById(R.id.animal_dog);
        mpDog_py= new MediaPlayer();
        mpDog_py=MediaPlayer.create(this, R.raw.dog_py);
        mpDog_eg= new MediaPlayer();
        mpDog_eg=MediaPlayer.create(this, R.raw.dog_eg);
        img_dog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try {
                    if (mpDog_py != null) {
                        mpDog_py.stop();
                    }
                    mpDog_py.prepare();
                    mpDog_py.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        textview_dogPy.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try
                {
                    if(mpDog_py!=null)
                    {
                        mpDog_py.stop();
                    }
                    mpDog_py.prepare();
                    mpDog_py.start();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }

        });
        textview_dogEg.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                try
                {
                    if(mpDog_eg!=null)
                    {
                        mpDog_eg.stop();
                    }
                    mpDog_eg.prepare();
                    mpDog_eg.start();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }

        });
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
