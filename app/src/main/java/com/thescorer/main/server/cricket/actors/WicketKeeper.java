package com.thescorer.main.server.cricket.actors;

import java.util.ArrayList;
import java.util.List;

import com.thescorer.main.server.generic.Player;

/**
 * @author Arun
 *
 */
public class WicketKeeper extends Player {

	private List<Wicket> wickets = new ArrayList<Wicket>();

	public List<Wicket> getWickets() {
		return wickets;
	}

	public void setWickets(List<Wicket> wickets) {
		this.wickets = wickets;
	}
	
}
