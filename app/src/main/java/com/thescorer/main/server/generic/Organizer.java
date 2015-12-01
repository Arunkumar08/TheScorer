package com.thescorer.main.server.generic;

import com.thescorer.main.server.actors.Actor;

/**
 * @author Arun
 *
 */
public class Organizer extends Actor {

	private String orgName;
	private String sponsor;
	
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	
}

