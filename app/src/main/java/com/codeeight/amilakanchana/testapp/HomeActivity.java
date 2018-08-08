package com.codeeight.amilakanchana.testapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class HomeActivity extends AppCompatActivity implements Food.OnFragmentInteractionListener, drink.OnFragmentInteractionListener {

    TabLayout homeTab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       /* Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        homeTab=findViewById(R.id.tbHomeTab);
        final ViewPager homePage =findViewById(R.id.vpHomePage);

        homeTab.addTab(homeTab.newTab().setText("Foods"));
        homeTab.addTab(homeTab.newTab().setText("Drinks"));
        homeTab.setTabGravity(TabLayout.GRAVITY_FILL);

        final PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(),homeTab.getTabCount());
        homePage.setAdapter(pageAdapter);
        homePage.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(homeTab));
        homeTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                homePage.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });










    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
