package com.thescorer.main.server.cricket.service;

import java.util.List;

import com.thescorer.main.server.generic.Fixtures;
import com.thescorer.main.server.generic.Organizer;
import com.thescorer.main.server.generic.Team;
import com.thescorer.main.server.generic.Tournament;
import com.thescorer.main.server.service.TournamentService;

/**
 * @author Arun
 *
 */
public class CricketTournamentService implements TournamentService {
	
	@Override
	public boolean setInitTournamentInfo(Tournament tournament) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean storeOrganizerInfo(Organizer organizer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Team> loadTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registerTeams(List<Team> teams) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createFixtures(Fixtures fixtures) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Fixtures loadFixtures() {
		// TODO Auto-generated method stub
		return null;
	}

}
