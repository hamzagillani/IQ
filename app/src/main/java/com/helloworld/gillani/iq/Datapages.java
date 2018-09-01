package com.helloworld.gillani.iq;



import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;

import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Datapages extends PagerAdapter {
    TextView textView;
    private Context context;
    private LayoutInflater layoutInflater;
    private  Integer[] images={R.drawable.page1,R.drawable.page2,
            R.drawable.page3,R.drawable.page4,R.drawable.page5,
            R.drawable.page6,R.drawable.page7,R.drawable.page8,R.drawable.page9,
            R.drawable.page10,R.drawable.page11};




    public Datapages(Pagesapp context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;}

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {


        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.data_pages, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.images_pages);
        textView=view.findViewById(R.id.image_counter);
        imageView.setImageResource(images[position]);
        textView.setText("IQ Page:"+"("+(position+1)+"/"+11+")");
        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp =(ViewPager) container;
        View view=(View) object;
        vp.removeView(view);

    }


}