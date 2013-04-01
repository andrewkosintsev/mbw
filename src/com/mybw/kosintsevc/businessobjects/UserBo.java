package com.mybw.kosintsevc.businessobjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserBo implements Serializable {

	private static final long serialVersionUID = 0xDeadBeaf;
	private String userID;
	private String firstName;
	private String password;
	private String dateOfBirth;
	private Map<TitleBo, AddBo> messagesSub;
	private RateBo userRate;
	private AddressBo addressData;
	private List<CarBo> cars;
	private ContactsBo contacts;

	public UserBo() {
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Map<TitleBo, AddBo> getMessagesSub() {
		if (messagesSub == null) {
			messagesSub = new TreeMap<TitleBo, AddBo>();
		}
		return messagesSub;
	}

	public void setMessagesSub(Map<TitleBo, AddBo> messagesSub) {
		this.messagesSub = messagesSub;
	}

	public RateBo getUserRate() {
		return userRate;
	}

	public void setUserRate(RateBo userRate) {
		this.userRate = userRate;
	}

	public AddressBo getAddressData() {
		return addressData;
	}

	public void setAddressData(AddressBo addressData) {
		this.addressData = addressData;
	}

	public List<CarBo> getCars() {
		if (cars == null) {
			cars = new ArrayList<CarBo>();
		}
		return cars;
	}

	public void setCars(List<CarBo> cars) {
		this.cars = cars;
	}

	public ContactsBo getContacts() {
		return contacts;
	}

	public void setContacts(ContactsBo contacts) {
		this.contacts = contacts;
	}
}
