package com.thescorer.main.server.cricket.actors;

import com.thescorer.main.server.actors.helperEnums.BallEventEnum;
import com.thescorer.main.server.actors.helperEnums.Run;

/**
 * @author Arun
 *
 */
public class Ball {

	private BallEventEnum ballEvent = BallEventEnum.DOT;
	private Run run = Run.DOT;
	private Integer runOnThisBall = 0;
	private Wicket wicket = null;
	
	public BallEventEnum getBallEvent() {
		return ballEvent;
	}
	public void setBallEvent(BallEventEnum ballEvent) {
		this.ballEvent = ballEvent;
	}
	public Run getRun() {
		return run;
	}
	public void setRun(Run run) {
		this.run = run;
	}
	public Integer getRunOnThisBall() {
		if (Run.RUNTIME != ballEvent.getRun()) {
			runOnThisBall = runOnThisBall + ballEvent.getRun().getRunValue(); 
		}
		return runOnThisBall = runOnThisBall + run.getRunValue();
	}
	public void setRunOnThisBall(Integer runOnThisBall) {
		this.runOnThisBall = runOnThisBall;
	}
	public Wicket getWicket() {
		return wicket;
	}
	public void setWicket(Wicket wicket) {
		this.wicket = wicket;
	}
	
}
