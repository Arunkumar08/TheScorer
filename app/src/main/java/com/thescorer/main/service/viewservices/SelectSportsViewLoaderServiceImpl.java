package com.thescorer.main.service.viewservices;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.worksofarun.thescorer.R;
import com.thescorer.main.TournamentHomePageActivity;
import com.thescorer.main.adapters.AdapterTypeEnum;
import com.thescorer.main.adapters.MyListAdapter;
import com.thescorer.main.jsonpojos.SportsInfo;
import com.thescorer.main.jsonpojos.SportsInfoWrapper;
import com.thescorer.main.data.service.impl.JsonFileLoaderService;
import com.thescorer.main.service.adapterServices.AbstractAdapterViewLoaderService;
import com.thescorer.main.service.adapterServices.AdapterViewLoaderService;
import com.thescorer.main.service.adapterServices.SportsTypeListAdapterServiceImpl;
import com.thescorer.main.viewhelpers.FileConstants;
import com.thescorer.main.viewhelpers.ViewTypeEnum;

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
