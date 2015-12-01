package com.thescorer.main.server.cricket.actors;

import java.util.Map;

import com.thescorer.main.server.actors.helperEnums.Run;
import com.thescorer.main.server.generic.Player;

/**
 * @author Arun
 *
 */
public class Batsman extends Player {

	private Boolean onStrike;
	private Long ballsFaced;
	private Long score;
	private Float strikeRate;
	private Map<Run, Integer> runDetailsMap;
	
	public Boolean getOnStrike() {
		return onStrike;
	}
	public void setOnStrike(Boolean onStrike) {
		this.onStrike = onStrike;
	}
	public Long getBallsFaced() {
		return ballsFaced;
	}
	public void setBallsFaced(Long ballsFaced) {
		this.ballsFaced = ballsFaced;
	}
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
	public Float getStrikeRate() {
		return strikeRate;
	}
	public void setStrikeRate(Float strikeRate) {
		this.strikeRate = strikeRate;
	}
	public Map<Run, Integer> getRunDetailsMap() {
		return runDetailsMap;
	}
	public void setRunDetailsMap(Map<Run, Integer> runDetailsMap) {
		this.runDetailsMap = runDetailsMap;
	}
	
	
	
}
