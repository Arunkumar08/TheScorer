package com.thescorer.main;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.worksofarun.thescorer.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class SelectTournaTypeActivityFragment extends Fragment {

    public SelectTournaTypeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_select_tourna_type, container, false);
    }
}
