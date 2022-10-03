package com.example.animation_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button fade,move,rotate,zoom,slide,bounce,blink, interpolator,stop;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.textView);
        fade=findViewById(R.id.Fade_f);
        move=findViewById(R.id.Move_m);
        rotate=findViewById(R.id.Rotate_r);
        zoom=findViewById(R.id.Zoom);
        slide=findViewById(R.id.Slide_s);
        bounce=findViewById(R.id.Bounce_b);
        blink=findViewById(R.id.Blink_b);
        interpolator=findViewById(R.id.Interploater_i);
        stop=findViewById(R.id.Stop_s);

        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                text.setVisibility(view.VISIBLE);
                text.startAnimation(animation);
            }
        });

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_right);
                text.setVisibility(view.VISIBLE);
                text.startAnimation(animation);
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                text.setVisibility(view.VISIBLE);
                text.startAnimation(animation);
            }
        });

        zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
                text.setVisibility(view.VISIBLE);
                text.startAnimation(animation);
            }
        });
        slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_right);
                text.setVisibility(view.VISIBLE);
                text.startAnimation(animation);
            }
        });
        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
                text.setVisibility(view.VISIBLE);
                text.startAnimation(animation);
            }
        });
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                text.setVisibility(view.VISIBLE);
                text.startAnimation(animation);
            }
        });
        interpolator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.interplater);
                text.setVisibility(view.VISIBLE);
                text.startAnimation(animation);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t= new Intent(MainActivity.this,MainActivity.class);
                startActivity(t);
                finish();
            }
        });

    }
}