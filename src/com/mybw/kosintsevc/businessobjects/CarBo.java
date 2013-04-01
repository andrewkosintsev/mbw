package com.mybw.kosintsevc.businessobjects;

import java.io.Serializable;

public class CarBo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 0xDaDFade;
	private String carModel;
	private String carMark;
	private String carYear;
	private String userID;

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarMark() {
		return carMark;
	}

	public void setCarMark(String carMark) {
		this.carMark = carMark;
	}

	public String getCarYear() {
		return carYear;
	}

	public void setCarYear(String carYear) {
		this.carYear = carYear;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}
}
