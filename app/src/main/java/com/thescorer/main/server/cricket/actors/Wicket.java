package com.thescorer.main.server.cricket.actors;

import com.thescorer.main.server.actors.helperEnums.WicketTypeEnum;

/**
 * @author Arun
 *
 */
public class Wicket {

	private Batsman batsman;
	private Bowler bowler;
	private WicketTypeEnum wicketType;
	
	public Batsman getBatsman() {
		return batsman;
	}
	public void setBatsman(Batsman batsman) {
		this.batsman = batsman;
	}
	public Bowler getBowler() {
		return bowler;
	}
	public void setBowler(Bowler bowler) {
		this.bowler = bowler;
	}
	public WicketTypeEnum getWicketType() {
		return wicketType;
	}
	public void setWicketType(WicketTypeEnum wicketType) {
		this.wicketType = wicketType;
	}

}
