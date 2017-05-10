package com.viewpager;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(TabViewPager) findViewById(R.id.view_pager);

        List<String> titles=new ArrayList<>();
        List<Fragment> fragments=new ArrayList<>();
        for (int i=0;i<10;i++){
            titles.add("第"+i+"页");
            fragments.add(new FragmentTest());
        }
        viewPager.addTitles(titles);
        viewPager.addFragments(fragments);
        viewPager.setTabIndicatorColor(getResources().getColor(R.color.colorPrimary));
        viewPager.setSelectedTabIndicatorHeight(10);
        viewPager.setTabTextColors(Color.BLACK,getResources().getColor(R.color.colorPrimary));
        viewPager.setTabMode(TabLayout.MODE_SCROLLABLE);
        viewPager.setTabGravity(Gravity.CENTER);
        viewPager.setPadding(10,10,10,10);
        viewPager.setAdapter();
    }
}
