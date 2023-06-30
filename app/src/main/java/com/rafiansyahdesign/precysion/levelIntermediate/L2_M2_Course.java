package com.rafiansyahdesign.precysion.levelIntermediate;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.rafiansyahdesign.precysion.R;
import com.rafiansyahdesign.precysion.ViewPagerAdapter;

public class L2_M2_Course extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l1_m1_course);

        viewPager = findViewById(R.id.viewpager);

        // setting up the adapter
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        // add the fragments
        viewPagerAdapter.add(new L2_M2_Page1(), "Page 1");
        viewPagerAdapter.add(new L2_M2_Page2(), "Page 2");
//        viewPagerAdapter.add(new L1_M1_Page3(), "Page 3");
//        viewPagerAdapter.add(new L1_M1_Page4(), "Page 4");

        // Set the adapter
        viewPager.setAdapter(viewPagerAdapter);

        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
