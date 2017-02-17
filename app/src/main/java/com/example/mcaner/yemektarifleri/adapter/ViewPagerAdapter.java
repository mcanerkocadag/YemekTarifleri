package com.example.mcaner.yemektarifleri.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mcaner on 15.02.2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentListesi=new ArrayList<>();
    private final List<String> fragmentBaslikListesi=new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentListesi.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListesi.size();
    }

    public void addFragment(Fragment fragment,String title){

        fragmentListesi.add(fragment);
        fragmentBaslikListesi.add(title);

    }
    public CharSequence getPageTitle(int position){

        return fragmentBaslikListesi.get(position);
    }


}
