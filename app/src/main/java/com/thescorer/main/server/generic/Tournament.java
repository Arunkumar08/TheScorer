package com.thescorer.main.server.generic;

import java.util.List;

/**
 * @author Arun
 *
 */
public class Tournament {

	private Organizer organizer;
	private List<Team> teams;
	private Fixtures fixture;
	private Results results;
	
	public Organizer getOrganizer() {
		return organizer;
	}
	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}
	public List<Team> getTeams() {
		return teams;
	}
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}
	public Fixtures getFixture() {
		return fixture;
	}
	public void setFixture(Fixtures fixture) {
		this.fixture = fixture;
	}
	public Results getResults() {
		return results;
	}
	public void setResults(Results results) {
		this.results = results;
	}

}
