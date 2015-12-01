package com.thescorer.main.server.cricket.actors;

import java.util.ArrayList;
import java.util.List;

import com.thescorer.main.server.actors.helperEnums.BallEventEnum;

/**
 * @author Arun
 *
 */
public class Over {
	
	private Bowler bowler;
	private List<Ball> balls = new ArrayList<Ball>();
	private Boolean currentOver = false;
	private Long runs = 0L;
	private Long extras = 0L;
	private Integer wickets = 0;
	
	public Boolean getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(Boolean currentOver) {
		this.currentOver = currentOver;
	}
	public Bowler getBowler() {
		return bowler;
	}
	public void setBowler(Bowler bowler) {
		this.bowler = bowler;
	}
	public List<Ball> getBalls() {
		return balls;
	}
	public void setBalls(List<Ball> balls) {
		this.balls = balls;
	}
	public Long getRuns() {
		for (Ball ball : getBalls()) {
			runs = runs + ball.getRunOnThisBall();
		}
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	public Long getExtras() {
		for(Ball ball : getBalls()) {
			if(BallEventEnum.getExtrasBalls().contains(ball.getBallEvent())) {
				extras = extras + ball.getRunOnThisBall();
			}
		}
		return extras;
	}
	public void setExtras(Long extras) {
		this.extras = extras;
	}
	public Integer getWickets() {
		for (Ball ball : balls) {
			if (ball.getWicket() != null) {
				wickets++;
			}
		}
		return wickets;
	}
	public void setWickets(Integer wickets) {
		this.wickets = wickets;
	}
}
