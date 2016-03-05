package com.example.qiuiqiu.babyplay;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by qiuiqiu on 2015/12/16.
 */
public class Activity_see extends AppCompatActivity {
    private Button btn_annimal;
    private Button btn_fruit;
    private Button btn_color;
    private Button btn_shape;
    private Button btn_math;
    private Button btn_trans;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see);
        btn_annimal = (Button) findViewById(R.id.btn_animal);
        btn_fruit = (Button) findViewById(R.id.btn_fruit);
        btn_color = (Button) findViewById(R.id.btn_color);
        btn_shape = (Button) findViewById(R.id.btn_shape);
        btn_math = (Button) findViewById(R.id.btn_math);
        btn_trans = (Button) findViewById(R.id.btn_trans);
        btn_annimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Activity_see","点击animal按钮");
                Intent intent = new Intent(Activity_see.this,Activity_animal.class);
                startActivity(intent);
            }
        });
        btn_fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_see.this,Activity_fruit.class);
                startActivity(intent);
            }
        });
        btn_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_see.this,Activity_color.class);
                startActivity(intent);
            }
        });
        btn_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_see.this,Activity_trans.class);
                startActivity(intent);
            }
        });
        btn_shape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_see.this,Activity_shape.class);
                startActivity(intent);
            }
        });
        btn_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_see.this,Activity_math.class);
                startActivity(intent);
            }
        });

    }
}
