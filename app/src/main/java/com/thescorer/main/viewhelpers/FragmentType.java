package com.thescorer.main.viewhelpers;

/**
 * Created by akumars on 8/3/2015.
 */
public enum FragmentType {
    CRICKET_TOURNAMENT_NEW("com.worksofarun.thescorer.fragments","CricketTournamentNew", ViewConstants.TITLE_TOURNAMENT_NEW_PAGE, 1),
    CRICKET_TOURNAMENT_GOING_ON("com.worksofarun.thescorer.fragments","CricketTournamentGoingOn", ViewConstants.TITLE_TOURNAMENT_GOING_ON_PAGE, 2),
    CRICKET_MATCH_NEW("com.worksofarun.thescorer.fragments","CricketMatchNew", ViewConstants.TITLE_MATCH_NEW_PAGE, 3);

    private String packageName;
    private String className;
    private String title;
    private int pageId;

    private FragmentType(final String packageName,
                         final String className,
                         final String title,
                         final int pageId){
        this.packageName = packageName;
        this.className = className;
        this.title = title;
        this.pageId = pageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public int getPageId() {
        return pageId;
    }

    public String getClassName() {
        return className;
    }

    public String getTitle() {
        return title;
    }
}

