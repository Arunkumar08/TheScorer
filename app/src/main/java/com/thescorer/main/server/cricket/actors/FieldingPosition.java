package com.thescorer.main.server.cricket.actors;

/**
 * @author Arun
 *
 */
public enum FieldingPosition {

	LONGON("Long On"),
	MIDON("Mid On"),
	SILLY_MIDON("Silly Mid On"),
	LONGOFF("Long Off"),
	MIDOFF("Mid Off"),
	SHORT_MIDOFF("Short Mid Off"),
	SILLY_MIDOFF("Silly Mid Off"),
	MIDWICKET("Mid Wicket"),
	DEEP_MIDWICKET("Deep Mid Wicket"),
	SHORT_LEG("Short Leg"),
	LONG_LEG("Long Leg"),
	SQUARELEG("Square Leg"),
	DEEP_SQUARELEG("Deep Square Leg"),
	SHORT_BACKWARD_SQUARELEG("Short Backward Square Leg"),
	DEEP_BACKWARD_SQUARELEG("Deep Backward Square Leg"),
	SHORT_FINELEG("Short Fine Leg"),
	FINELEG("Fine Leg"),
	LONG_STOP("Long Stop"),
	COW_CORNER("Cow Corner"),
	SILLY_POINT("Silly Point"),
	POINT("Point"),
	BACKWARD_POINT("Backward Point"),
	COVER_POINT("Cover Point"),
	COVER("Cover"),
	DEEP_COVER("Deep Cover"),
	EXTRA_COVER("Extra Cover"),
	DEEP_EXTRA_COVER("Deep Extra Cover"),
	SWEEPER("Sweeper"),
	THIRDMAN("Third Man"),	
	FIRST_SLIP("First Slip"),
	SECOND_SLIP("Second Slip"),
	THIRD_SLIP("Third Slip"),
	FOURTH_SLIP("Fourth Slip"),
	FLY_SLIP("Fly Slip"),
	GULLY("Gully"),
	;
	
	private final String positionString;
	
	private FieldingPosition(final String positionString) {
		this.positionString = positionString;
	}

	public String getPositionString() {
		return positionString;
	}
	
}
