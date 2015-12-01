package com.thescorer.main.server.generic;

/**
 * @author Arun
 *
 */
public class Winner {

	private Team team;
	private Long wonBy;

	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Long getWonBy() {
		return wonBy;
	}
	public void setWonBy(Long wonBy) {
		this.wonBy = wonBy;
	}
	
}
