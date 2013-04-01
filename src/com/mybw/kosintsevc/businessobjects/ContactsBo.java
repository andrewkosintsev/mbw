package com.mybw.kosintsevc.businessobjects;

import java.io.Serializable;

public class ContactsBo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 0xBabe;
	private String phoneNumber;
	private String personalWebSite;
	private String additionalCode;
	private String additionalInfo;
	private String userID;
	private String emailAddress;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPersonalWebSite() {
		return personalWebSite;
	}

	public void setPersonalWebSite(String personalWebSite) {
		this.personalWebSite = personalWebSite;
	}

	public String getAdditionalCode() {
		return additionalCode;
	}

	public void setAdditionalCode(String additionalCode) {
		this.additionalCode = additionalCode;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
