package com.nidhigondhia.demo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    private ArrayList<String> strs;

    private FragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // create an custom array list of your object class here which you can pass to pager adapter
        strs = new ArrayList<String>();
        strs.add("Fragment 1");
        strs.add("Fragment 2");
        strs.add("Fragment 3");
        strs.add("Fragment 4");
        strs.add("Fragment 5");


        viewPager = (ViewPager) findViewById(R.id.pager);

        adapter = new FragmentPagerAdapter(getSupportFragmentManager(), strs);
        viewPager.setAdapter(adapter);
    }

    public class FragmentPagerAdapter extends FragmentStatePagerAdapter {

        private ArrayList<String> itemData;
        public FragmentPagerAdapter(FragmentManager fm, ArrayList<String> itemData) {
            super(fm);
            this.itemData = itemData;
        }

        @Override
        public int getCount() {
            return itemData.size();
        }
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
        }
        @Override
        public Fragment getItem(int position) {
            // pass data to fragment
            Fragment1 f = Fragment1.newInstance(itemData.get(position));
            return f;
        }
    }
}
