package com.helloworld.gillani.iq;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Pagesapp extends AppCompatActivity {


    private  Integer[] images={R.drawable.page1,R.drawable.page2,
            R.drawable.page3,R.drawable.page4,R.drawable.page5,
            R.drawable.page6,R.drawable.page7,R.drawable.page8,R.drawable.page9,
            R.drawable.page10,R.drawable.page11};

    private Button p1;
    private Button p2;
    ViewPager viewPager;
    private ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageView=findViewById(R.id.images_pages);

        setContentView(R.layout.pages);
        viewPager=findViewById(R.id.viewpager);

        Datapages datapages=new Datapages(this);
        viewPager.setAdapter(datapages);






















    }}