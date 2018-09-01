package com.helloworld.gillani.iq;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Buttons extends AppCompatActivity {

    private  Integer[] images={R.drawable.page1,R.drawable.page2,
            R.drawable.page3,R.drawable.page4,R.drawable.page5,
            R.drawable.page6,R.drawable.page7,R.drawable.page8,R.drawable.page9,
            R.drawable.page10,R.drawable.page11};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttons);



    }

    public void onPage1(View view) {

        Intent intent = new Intent(this, Pagesapp.class);
        startActivity(intent);
    }


    public void onPage2(View view) {

        Intent intent=new Intent(Buttons.this,Pagesapp.class);
        startActivity(intent);


    }


}
