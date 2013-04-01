package com.mybw.kosintsevc.businessobjects;

import java.io.Serializable;

public class AddressBo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 0xBadAdd;
	private String country;
	private String city;
	private String userID;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}
}
