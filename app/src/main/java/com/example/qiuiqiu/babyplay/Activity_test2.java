package com.example.qiuiqiu.babyplay;

import java.util.Random;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.sax.TextElementListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_test2 extends Activity {
    //ApplicationInfo appInfo = getApplicationInfo();
    private ImageView mImageView01;
    private ImageView mImageView02;
    private ImageView mImageView03;
    private ImageView mImageView04;
    private String string;
    private TextView textview;
    private TextView textview1;
    private int x;
    private static int[] s1 = new int[]{R.mipmap.cat, R.mipmap.pingguo, R.mipmap.xiangjiao, R.mipmap.cattle, R.mipmap.dog, R.mipmap.juzi};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mImageView01 = (ImageView) findViewById(R.id.mImageView01);
        mImageView02 = (ImageView) findViewById(R.id.mImageView02);
        mImageView03 = (ImageView) findViewById(R.id.mImageView03);
        mImageView04 = (ImageView) findViewById(R.id.mImageView04);
        randon();
        textview = (TextView) findViewById(R.id.textView1);
        textview1 = (TextView) findViewById(R.id.textView2);
        mImageView01.setImageDrawable(getResources().getDrawable(s1[0]));
        mImageView02.setImageDrawable(getResources().getDrawable(s1[1]));
        mImageView03.setImageDrawable(getResources().getDrawable(s1[2]));
        mImageView04.setImageDrawable(getResources().getDrawable(s1[3]));
        Random rand = new Random();
        x = rand.nextInt(4);
        string = getResources().getResourceEntryName(s1[x]);
        textview.setText("请在四幅图中指出:"+string);
        mImageView01.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (s1[0] == s1[x]) {
                    textview1.setText("哇！你猜对了");
                    Intent intent = new Intent(Activity_test2.this, Activity_test3.class);
                    startActivity(intent);

                } else {
                    textview1.setText("错了，再猜猜");
                }
            }
        });
        mImageView02.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                if (s1[1] == s1[x]) {
                    textview1.setText("哇！你猜对了");
                    Intent intent = new Intent(Activity_test2.this, Activity_test3.class);
                    startActivity(intent);

                } else {
                    textview1.setText("错了，再猜猜");
                }
            }
        });
        mImageView03.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (s1[2] == s1[x]) {
                    textview1.setText("哇！你猜对了");
                    Intent intent = new Intent(Activity_test2.this, Activity_test3.class);
                    startActivity(intent);

                } else {
                    textview1.setText("错了，再猜猜");
                }
            }
        });
        mImageView04.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (s1[3] == s1[x]) {
                    textview1.setText("哇！你猜对了");

                    Intent intent = new Intent(Activity_test2.this, Activity_test3.class);
                    startActivity(intent);

                } else {
                    textview1.setText("错了，再猜猜");
                }
            }
        });
    }


    private void randon() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 6; i++) {
            int tmp = s1[i];
            int s = (int) (Math.random() * 2);
            s1[i] = s1[s];
            s1[s] = tmp;
        }
    }
}
