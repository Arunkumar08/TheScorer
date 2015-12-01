package com.thescorer.main.server.generic;

public enum MatchPhase {

	LEAGUE("League"),
	KNOCKOUT("Knock Out"),
	QUATER_FINAL("Quarter Final"),
	SEMI_FINAL("Semi Final"),
	FINAL("Final");
	
	private final String phaseString;
	
	private MatchPhase(final String phaseString){
		this.phaseString = phaseString;
	}

	public String getPhaseString() {
		return phaseString;
	}
	
}
