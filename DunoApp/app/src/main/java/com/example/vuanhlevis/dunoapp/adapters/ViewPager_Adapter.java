package com.example.vuanhlevis.dunoapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.vuanhlevis.dunoapp.fragments.FriendsFragment;
import com.example.vuanhlevis.dunoapp.fragments.Message_menuFragment;
import com.example.vuanhlevis.dunoapp.fragments.Unread_Fragment;

/**
 * Created by vuanhlevis on 25/01/2018.
 */

public class ViewPager_Adapter extends FragmentPagerAdapter {
    public ViewPager_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Message_menuFragment();
            case 1:
                return new FriendsFragment();

            case 2:
                return new Unread_Fragment();

        }


        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
