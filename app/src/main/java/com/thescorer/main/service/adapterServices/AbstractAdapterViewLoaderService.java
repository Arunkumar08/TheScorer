package com.thescorer.main.service.adapterServices;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.thescorer.main.service.viewservices.ViewLoaderService;

/**
 * Created by akumars on 7/29/2015.
 */
public abstract class AbstractAdapterViewLoaderService implements ViewLoaderService {

    final Context context;
    final LayoutInflater inflater;

    public AbstractAdapterViewLoaderService(final Context context) {
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View loadView() {
        return prepareView();
    }

    public abstract View prepareView();
}
