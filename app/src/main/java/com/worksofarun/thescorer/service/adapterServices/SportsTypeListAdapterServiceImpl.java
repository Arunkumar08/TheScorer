package com.worksofarun.thescorer.service.adapterServices;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.worksofarun.thescorer.R;
import com.worksofarun.thescorer.jsonpojos.SportsInfo;

import java.util.List;

/**
 * Created by akumars on 7/24/2015.
 */
public class SportsTypeListAdapterServiceImpl extends AbstractAdapterViewLoaderService {

    public SportsTypeListAdapterServiceImpl(Context context) {
        super(context);
    }

    public View loadViewForAdapter(Context context, List items, int position, ViewGroup parent) {
        View rowView = inflater.inflate(R.layout.sportstypelayout, parent, false);
        Button button = (Button) rowView.findViewById(R.id.buttonSports);
        SportsInfo rowInfo = (SportsInfo)items.get(position);
        button.setText(rowInfo.getSportsName());
        button.setEnabled(rowInfo.getSportsActive());
        return rowView;
    }

    @Override
    public View loadView() {
        View rowView = inflater.inflate(R.layout.sportstypelayout, parent, false);
        Button button = (Button) rowView.findViewById(R.id.buttonSports);
        SportsInfo rowInfo = (SportsInfo)items.get(position);
        button.setText(rowInfo.getSportsName());
        button.setEnabled(rowInfo.getSportsActive());
        return rowView;
        return null;
    }
}
