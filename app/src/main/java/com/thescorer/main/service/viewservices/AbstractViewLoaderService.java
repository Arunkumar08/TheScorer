package com.thescorer.main.service.viewservices;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import com.thescorer.main.viewhelpers.ViewTypeEnum;

/**
 * Created by akumars on 8/10/2015.
 */
public abstract class AbstractViewLoaderService implements ViewLoaderService {

    final Context context;
    final ViewTypeEnum viewTypeEnum;

    public AbstractViewLoaderService(final Context context,
                                     final ViewTypeEnum viewTypeEnum) {
        this.context = context;
        this.viewTypeEnum = viewTypeEnum;
    }

    @Override
    public View loadView() {
        return prepareView();
    }

    public Context getContext() {
        return context;
    }

    public Activity getActivity() {
        if (!(context instanceof Activity))
            return null;
        return (Activity) context;
    }

    public ViewTypeEnum getViewTypeEnum() {
        return viewTypeEnum;
    }

    public abstract View prepareView();
}
