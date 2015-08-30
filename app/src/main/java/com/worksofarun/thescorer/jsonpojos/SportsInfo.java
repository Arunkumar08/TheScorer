package com.worksofarun.thescorer.jsonpojos;

/**
 * Created by akumars on 7/22/2015.
 */
public class SportsInfo {

    private String sportsName;
    private String sportsImageName;
    private Boolean sportsActive;

    public Boolean getSportsActive() {
        return sportsActive;
    }

    public void setSportsActive(Boolean sportsActive) {
        this.sportsActive = sportsActive;
    }

    public String getSportsImageName() {
        return sportsImageName;
    }

    public void setSportsImageName(String sportsImageName) {
        this.sportsImageName = sportsImageName;
    }

    public String getSportsName() {
        return sportsName;
    }

    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }

}
