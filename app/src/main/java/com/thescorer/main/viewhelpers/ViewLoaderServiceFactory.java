package com.thescorer.main.viewhelpers;

import android.app.Activity;

import com.thescorer.main.service.viewservices.SelectSportsViewLoaderServiceImpl;
import com.thescorer.main.service.viewservices.ViewLoaderService;

/**
 * Created by akumars on 7/29/2015.
 */
public class ViewLoaderServiceFactory {

    public static ViewLoaderService getViewLoaderService(final Activity context,
                                                         final ViewTypeEnum viewTypeEnum) {
        ViewLoaderService service = null;
        if (ViewTypeEnum.SELECT_SPORTS_VIEW == viewTypeEnum) {
            service = new SelectSportsViewLoaderServiceImpl(context, viewTypeEnum);
        }
        return service;
    }
}
