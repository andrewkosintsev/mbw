package com.mybw.kosintsevc.businessobjects;

import java.io.Serializable;

public class RateBo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 0xBadDad;
	private int pluses;
	private int minuses;
	private String rate;
	private String userID;

	public int getPluses() {
		return pluses;
	}

	public void setPluses(int pluses) {
		this.pluses = pluses;
	}

	public int getMinuses() {
		return minuses;
	}

	public void setMinuses(int minuses) {
		this.minuses = minuses;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

}
