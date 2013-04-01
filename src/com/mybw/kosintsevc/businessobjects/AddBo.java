package com.mybw.kosintsevc.businessobjects;

import java.io.Serializable;

public class AddBo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 0xDeadC0de;
	private String messageText;
	private String userID;
	private String date;
	private String messageID;

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMessageID() {
		return messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}
}
