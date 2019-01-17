package com.example.shubh.draganddrop;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity implements GestureDetector.OnGestureListener {
GestureDetectorCompat gestureDetectorCompat;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        gestureDetectorCompat=new GestureDetectorCompat(this,this);
        layout = findViewById(R.id.ml);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        if (this.gestureDetectorCompat.onTouchEvent(event)) {
            return true;
        }
        TextView textView=new TextView(this);
        textView.setText(event.toString());
        layout.addView(textView);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        TextView textView=new TextView(this);
        textView.setText(e.toString());
        layout.addView(textView);



        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        TextView textView=new TextView(this);
        textView.setText(e.toString());
        layout.addView(textView);

        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        TextView textView=new TextView(this);
        textView.setText(e1.toString());
        textView.append(e2.toString());
        textView.append("X distance== "+distanceX+"y distance== "+distanceY);


        layout.addView(textView);
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        TextView textView=new TextView(this);
        textView.setText(e.toString());
        layout.addView(textView);

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        TextView textView=new TextView(this);
        textView.setText(e1.toString());
        textView.append(e2.toString());
        textView.append("X velocity== "+velocityX+"y velocity== "+velocityY);
        return false;
    }
}
