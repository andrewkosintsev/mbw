package com.mybw.kosintsevc.businessobjects;

import java.io.Serializable;

public class TitleBo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 0xBadCafe;
	private String titleID;
	private String userID;

	public String getTitleID() {
		return titleID;
	}

	public void setTitleID(String titleID) {
		this.titleID = titleID;
	}

	public String getTitleText() {
		return titleText;
	}

	public void setTitleText(String titleText) {
		this.titleText = titleText;
	}

	public String getMessageID() {
		return messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	private String titleText;
	private String messageID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}
}
