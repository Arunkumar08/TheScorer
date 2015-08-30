package com.worksofarun.thescorer.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.worksofarun.thescorer.fragments.FragmentFactory;
import com.worksofarun.thescorer.viewhelpers.FragmentType;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by akumars on 8/3/2015.
 */
public class TournamentHomePageAdapter extends FragmentStatePagerAdapter {

    final List<FragmentType> fragmentTypeList = getFragments();
    private Context context;

    public TournamentHomePageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        try {
            fragment = FragmentFactory.getFragment(fragmentTypeList.get(position));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return fragmentTypeList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTypeList.get(position).getTitle();
    }

    private List<FragmentType> getFragments(){
        List<FragmentType> fragmentTypeList = new ArrayList<FragmentType>();
        fragmentTypeList.add(FragmentType.CRICKET_TOURNAMENT_NEW);
        fragmentTypeList.add(FragmentType.CRICKET_TOURNAMENT_GOING_ON);
        fragmentTypeList.add(FragmentType.CRICKET_MATCH_NEW);
        return fragmentTypeList;
    }
}
