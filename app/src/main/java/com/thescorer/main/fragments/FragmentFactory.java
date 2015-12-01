package com.thescorer.main.fragments;

import android.support.v4.app.Fragment;
import com.thescorer.main.viewhelpers.FragmentType;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by akumars on 8/3/2015.
 */
public final class FragmentFactory {

    public static Fragment getFragment(final FragmentType type) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class fragmentClass = Class.forName(String.format("%s.%s", type.getPackageName(), type.getClassName()));
        return (Fragment) fragmentClass.getConstructor().newInstance();
    }
}
