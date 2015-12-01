package com.thescorer.main.server.actors.helperEnums;

/**
 * @author Arun
 *
 */
public enum WicketTypeEnum {

	BOWLED("Bowled", 1),
	CAUGHT("Caught", 1),
	RUN_OUT("Run out", 0),
	HIT_OUT("Hit out", 1),
	RETIRED_OUT("Retired out", 0);
	
	private final String wicketString;
	private final Integer bowlerCount;
	
	private WicketTypeEnum(final String wicketString,
						   final Integer bowlerCount) {
		this.wicketString = wicketString;
		this.bowlerCount = bowlerCount;
	}
	
	public String getWicketString() {
		return wicketString;
	}

	public Integer getBowlerCount() {
		return bowlerCount;
	}
}
