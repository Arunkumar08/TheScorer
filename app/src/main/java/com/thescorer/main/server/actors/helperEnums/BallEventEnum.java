package com.thescorer.main.server.actors.helperEnums;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arun
 *
 */
public enum BallEventEnum {

	WIDE("wide",false,Run.SINGLE),
	NOBALL_2BOUNCE("no-ball for bounce", false, Run.SINGLE),
	BYES("byes", true, Run.RUNTIME),
	LEG_BYES("leg-byes", true, Run.RUNTIME),
	NOBALL_FULL("no-ball for high full toss", false, Run.SINGLE),
	DEAD_BALL("dead ball", false, Run.DOT),
	RUN("run", true, Run.RUNTIME),
	DOT("dot ball", true, Run.DOT),
	WICKET("wicket", true, Run.DOT);
	
	private final String eventString;
	private final Boolean isValid;
	private final Run run;
	
	private BallEventEnum(final String eventString,
						  final Boolean isValid,
						  final Run run
						  ) {
		this.eventString = eventString;
		this.isValid = isValid;
		this.run = run;
	}

	public String getEventString() {
		return eventString;
	}

	public Boolean getIsValid() {
		return isValid;
	}

	public Run getRun() {
		return run;
	}
	
	public static List<BallEventEnum> getExtrasBalls(){
		final List<BallEventEnum> extraBalls = new ArrayList<BallEventEnum>();
		extraBalls.add(BallEventEnum.WIDE);
		extraBalls.add(BallEventEnum.NOBALL_2BOUNCE);
		extraBalls.add(BallEventEnum.NOBALL_FULL);
		return extraBalls;
	}
}
