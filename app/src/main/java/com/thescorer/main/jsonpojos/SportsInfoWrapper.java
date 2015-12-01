package com.thescorer.main.jsonpojos;

import java.util.Map;

/**
 * Created by akumars on 7/29/2015.
 */
public class SportsInfoWrapper {

    private Map<String, SportsInfo> sportsInfoMap;

    public Map<String, SportsInfo> getSportsInfoMap() {
        return sportsInfoMap;
    }

    public void setSportsInfoMap(Map<String, SportsInfo> sportsInfoMap) {
        this.sportsInfoMap = sportsInfoMap;
    }
}
