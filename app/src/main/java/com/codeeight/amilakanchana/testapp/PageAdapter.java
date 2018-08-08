package com.codeeight.amilakanchana.testapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Amila on 8/8/2018.
 */

public class PageAdapter extends FragmentStatePagerAdapter {
    int NoOfTabs;

    public PageAdapter(FragmentManager fm, int noOfTabs) {
        super(fm);
        NoOfTabs = noOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Food food = new Food();
                return  food;
            case 1:
                drink drnk = new drink();
                return drnk;
            default:
                return  null;
        }
    }

    @Override
    public int getCount() {
        return NoOfTabs;
    }
}
