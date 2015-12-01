package com.thescorer.main.server.generic;

import java.sql.Date;
import java.sql.Time;

public class Match {

	private Team team1;
	private Team team2;
	private Winner winner;
	private Loser loser;
	private Player playerOfMatch;
	private Scorecard scorecard;
	private MatchPhase phase;
	private Date matchDate;
	private Time matchStartTime;
	
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	public Winner getWinner() {
		return winner;
	}
	public void setWinner(Winner winner) {
		this.winner = winner;
	}
	public Loser getLoser() {
		return loser;
	}
	public void setLoser(Loser loser) {
		this.loser = loser;
	}
	public Player getPlayerOfMatch() {
		return playerOfMatch;
	}
	public void setPlayerOfMatch(Player playerOfMatch) {
		this.playerOfMatch = playerOfMatch;
	}
	public Scorecard getScorecard() {
		return scorecard;
	}
	public void setScorecard(Scorecard scorecard) {
		this.scorecard = scorecard;
	}
	public MatchPhase getPhase() {
		return phase;
	}
	public void setPhase(MatchPhase phase) {
		this.phase = phase;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public Time getMatchStartTime() {
		return matchStartTime;
	}
	public void setMatchStartTime(Time matchStartTime) {
		this.matchStartTime = matchStartTime;
	}
	
}
