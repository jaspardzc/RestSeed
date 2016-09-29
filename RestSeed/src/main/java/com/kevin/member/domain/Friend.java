package com.kevin.member.domain;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Friend")
public class Friend {
	
	private List<String> userIdList;
	private String firstName;
	private String lastName;
	private boolean active;
	private String gender;
	
	public Friend() {}
	
	public List<String> getUserIdList() {
		return userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
