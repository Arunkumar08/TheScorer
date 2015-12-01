package com.thescorer.main.server.generic;

public class Loser {

	private Team team;
	private Long lostBy;

	public Long getLostBy() {
		return lostBy;
	}
	public void setLostBy(Long lostBy) {
		this.lostBy = lostBy;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}

}
