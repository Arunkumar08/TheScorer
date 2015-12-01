package com.thescorer.main.adapters;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import com.thescorer.main.service.adapterServices.AdapterViewLoaderService;
import com.thescorer.main.service.viewservices.ViewLoaderService;

import java.util.List;

/**
 * Created by akumars on 7/23/2015.
 */
public class MyListAdapter<T> implements ListAdapter {

    Context context = null;
    List<T> items;
    AdapterTypeEnum adapterType;
    AdapterViewLoaderService viewLoaderService;

    public MyListAdapter(final Context context,
                         final List<T> items ,
                         final AdapterTypeEnum adapterType,
                         final ViewLoaderService viewLoaderService) {
        this.context = context;
        this.items = items;
        this.adapterType = adapterType;
        this.viewLoaderService = viewLoaderService;
}

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public T getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items.indexOf(getItem(position));
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return viewLoaderService.loadViewForAdapter(position, convertView, parent);
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
