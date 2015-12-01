package com.thescorer.main.server.cricket.actors;

import java.util.ArrayList;
import java.util.List;

import com.thescorer.main.server.generic.Player;

/**
 * @author Arun
 *
 */
public class Bowler extends Player {
	
	private Boolean bowling = false;
	private Long runsGiven = 0L;
	private Float strikeRate = 0F;
	private Float economy = 0F;
	private Integer wickets = 0;
	private List<Over> overs = new ArrayList<Over>();
	
	public Boolean getBowling() {
		return bowling;
	}
	public void setBowling(Boolean bowling) {
		this.bowling = bowling;
	}
	public Long getRunsGiven() {
		return runsGiven;
	}
	public void setRunsGiven(Long runsGiven) {
		this.runsGiven = runsGiven;
	}
	public List<Over> getOvers() {
		return overs;
	}
	public void setOvers(List<Over> overs) {
		this.overs = overs;
	 }	
	
	public Float getStrikeRate() {
		return strikeRate;
	}
	public void setStrikeRate(Float strikeRate) {
		this.strikeRate = strikeRate;
	}
	public Float getEconomy() {
		return economy;
	}
	public void setEconomy(Float economy) {
		this.economy = economy;
	}
	public Long getTotalRunsGivenForThisOver() {
		overs.get(overs.size()-1);
		return runsGiven;
	}
	public Integer getWickets() {
		return wickets;
	}
	public void setWickets(Integer wickets) {
		this.wickets = wickets;
	}

}
