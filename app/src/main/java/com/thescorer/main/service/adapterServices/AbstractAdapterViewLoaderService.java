package com.thescorer.main.service.adapterServices;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thescorer.main.service.viewservices.ViewLoaderService;

import java.util.List;

/**
 * Created by akumars on 7/29/2015.
 */
public abstract class AbstractAdapterViewLoaderService {

    final Context context;
    final LayoutInflater inflater;

    public AbstractAdapterViewLoaderService(final Context context) {
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public abstract View loadViewForAdapter(Context context, List items, int position, ViewGroup parent);
}
