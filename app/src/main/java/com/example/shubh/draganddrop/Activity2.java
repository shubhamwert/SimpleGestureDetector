package com.example.shubh.draganddrop;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Activity2 extends AppCompatActivity implements GestureDetector.OnGestureListener {
GestureDetectorCompat gestureDetectorCompat;
    LinearLayout layout;
    List<String> TextDAta=new ArrayList<>();
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    CustomRecyclerView customRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        gestureDetectorCompat=new GestureDetectorCompat(this,this);
        layout = findViewById(R.id.ml);


        recyclerView = findViewById(R.id.m_recyclers);

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        TextDAta.add("hello");
        customRecyclerView = new CustomRecyclerView(TextDAta);
        recyclerView.setAdapter(customRecyclerView);


    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        if (this.gestureDetectorCompat.onTouchEvent(event)) {
            return true;
        }
        TextDAta.add(event.toString());
        customRecyclerView.notifyDataSetChanged(TextDAta);
        recyclerView.setAdapter(customRecyclerView);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        TextDAta.add(e.toString());
        customRecyclerView.notifyDataSetChanged(TextDAta);
        recyclerView.setAdapter(customRecyclerView);



        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        TextDAta.add(e.toString());
        customRecyclerView.notifyDataSetChanged(TextDAta);
        recyclerView.setAdapter(customRecyclerView);

        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        TextDAta.add(e1.toString());
        TextDAta.add(e2.toString());
        TextDAta.add("Distance X=="  +distanceX);
        TextDAta.add("Distancey=="+distanceY);
        customRecyclerView.notifyDataSetChanged(TextDAta);
        recyclerView.setAdapter(customRecyclerView);



        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        TextDAta.add(e.toString());
        customRecyclerView.notifyDataSetChanged(TextDAta);
        recyclerView.setAdapter(customRecyclerView);


    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        TextDAta.add(e1.toString());
        TextDAta.add(e2.toString());
        TextDAta.add("velocity X=="  +velocityX);
        TextDAta.add("Velocity Y=="+velocityY);
        customRecyclerView.notifyDataSetChanged(TextDAta);
        recyclerView.setAdapter(customRecyclerView);

        return false;
    }
}
