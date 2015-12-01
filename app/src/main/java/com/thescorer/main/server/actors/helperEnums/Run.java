package com.thescorer.main.server.actors.helperEnums;

/**
 * @author Arun
 *
 */
public enum Run {
	
	RUNTIME("runtime-update", 1000),
	DOT("dot", 0),
	SINGLE("single", 1),
	DOUBLE("double", 2),
	THREE("three", 3),
	FOUR("four", 4),
	FIVE("five", 5),
	SIX("six", 6),
	SEVEN("seven", 7),
	EIGHT("eight", 8),
	NINE("nine", 9),
	TEN("ten", 10),
	ELEVEN("eleven", 11);
	
	private final String runString;
	private final Integer runValue;
	
	private Run(final String runString, final Integer runValue) {
		this.runString = runString;
		this.runValue = runValue;
	}

	public String getRunString() {
		return runString;
	}

	public Integer getRunValue() {
		return runValue;
	}
	
}
