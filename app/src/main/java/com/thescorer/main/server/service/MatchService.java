package com.thescorer.main.server.service;

import com.thescorer.main.server.generic.Result;
import com.thescorer.main.server.generic.Scorecard;

public interface MatchService {

	/**
	 * Store the live score information and updates all other details
	 * because of these score change
	 */
	public Scorecard updateScore(Scorecard scorecard);
	
	/**
	 * Get the score-card of the match
	 */
	public Scorecard getScorecard();
	
	/**
	 * Get the match result details
	 */
	public Result getResult();
	
	/**
	 * Update the match result dependents - points, statistics, etc.. 
	 */
	public Boolean updateMatchDependents();
}
