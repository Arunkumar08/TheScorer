package com.thescorer.main.server.service;

import java.util.List;

import com.thescorer.main.server.generic.Fixtures;
import com.thescorer.main.server.generic.Organizer;
import com.thescorer.main.server.generic.Team;
import com.thescorer.main.server.generic.Tournament;

/**
 * @author Arun
 *
 */
public interface TournamentService {
	
	/**
	 * Set the initial information required to start the tournament
	 */
	public boolean setInitTournamentInfo(Tournament tournament);
	
	/**
	 * Store the organizer information
	 */
	public boolean storeOrganizerInfo(Organizer organizer);
	
	/**
	 * Get the list of teams info registered for tournament
	 */
	public List<Team> loadTeams();
	
	/**
	 * Registering the teams for the tournament
	 */
	public boolean registerTeams(List<Team> teams);
	
	/**
	 * Create the fixtures for the tournament
	 */
	public boolean createFixtures(Fixtures fixtures);
	
	/**
	 * Loading the fixtures for the tournament
	 */
	public Fixtures loadFixtures();
	
}
