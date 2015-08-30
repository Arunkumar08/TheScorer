package com.worksofarun.thescorer.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.worksofarun.thescorer.R;
import com.worksofarun.thescorer.viewhelpers.ViewConstants;

/**
 * Created by akumars on 8/4/2015.
 */
public class CricketMatchNew extends Fragment {

    private int page = 3;

    public CricketMatchNew(){
        Bundle args = new Bundle();
        args.putInt(ViewConstants.FRAGMENT_PAGE, page);
        setArguments(args);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(ViewConstants.FRAGMENT_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cricketmatchnew, container, false);
        return view;
    }
}

