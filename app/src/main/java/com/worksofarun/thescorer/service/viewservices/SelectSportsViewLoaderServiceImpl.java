package com.worksofarun.thescorer.service.viewservices;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.worksofarun.thescorer.R;
import com.worksofarun.thescorer.TournamentHomePageActivity;
import com.worksofarun.thescorer.adapters.AdapterTypeEnum;
import com.worksofarun.thescorer.adapters.MyListAdapter;
import com.worksofarun.thescorer.jsonpojos.SportsInfo;
import com.worksofarun.thescorer.jsonpojos.SportsInfoWrapper;
import com.worksofarun.thescorer.data.service.impl.JsonFileLoaderService;
import com.worksofarun.thescorer.service.adapterServices.AbstractAdapterViewLoaderService;
import com.worksofarun.thescorer.service.adapterServices.AdapterViewLoaderService;
import com.worksofarun.thescorer.service.adapterServices.SportsTypeListAdapterServiceImpl;
import com.worksofarun.thescorer.viewhelpers.FileConstants;
import com.worksofarun.thescorer.viewhelpers.ViewTypeEnum;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by akumars on 7/29/2015.
 */
public class SelectSportsViewLoaderServiceImpl extends AbstractViewLoaderService {

    public SelectSportsViewLoaderServiceImpl(final Activity activity,
                                             final ViewTypeEnum viewTypeEnum) {
        super(activity, viewTypeEnum);
    }

    @Override
    public View prepareView() {
        ListView listView = (ListView) getActivity().findViewById(R.id.SelectSports);
        final List<SportsInfo> sportsInfoList = loadSportsInfoList(getActivity());
        AbstractAdapterViewLoaderService viewLoaderService = new SportsTypeListAdapterServiceImpl(getActivity());
        MyListAdapter adapter = new MyListAdapter(getActivity(), sportsInfoList, AdapterTypeEnum.SPORTS_TYPE, viewLoaderService);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SportsInfo sportsInfo = sportsInfoList.get(position);
                if(sportsInfo.getSportsName().equals("Cricket")){
                    Intent intent = new Intent(getActivity(), TournamentHomePageActivity.class);
                    getActivity().startActivity(intent);
                }
            }
        });
        return listView;
    }

    private List<SportsInfo> loadSportsInfoList(Activity activity) {
        List<SportsInfo> sportsList = null;
        try {
            InputStream inputStream = activity.getAssets().open(FileConstants.SPORTS_INFO_JSON_NAME);
            JsonFileLoaderService<SportsInfoWrapper> jsonFileLoaderService = new JsonFileLoaderService<SportsInfoWrapper>();
            SportsInfoWrapper sportsInfoWrapper = jsonFileLoaderService.loadFileToPojo(inputStream, SportsInfoWrapper.class);
            Map<String, SportsInfo> sportsMap = sportsInfoWrapper.getSportsInfoMap();
            System.out.println("sportsMap: "+sportsMap );
            sportsList = new ArrayList<SportsInfo>(sportsMap.values());
        } catch (IOException exception){

        }
        return sportsList;
    }

}
