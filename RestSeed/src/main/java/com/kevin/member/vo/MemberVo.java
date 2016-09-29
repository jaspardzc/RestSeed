package com.kevin.member.vo;

import java.util.List;

import com.kevin.member.domain.Friend;
import com.kevin.member.enums.Status;

public class MemberVo {
	
	private String memberId;
	private String memberFirstName;
	private String memberLastName;
	private String memberEmail;
	private String occupation;
	private String memberDOB;
	private String role;
	private List<Friend> friendsList;
	private Status status;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberFirstName() {
		return memberFirstName;
	}
	public void setMemberFirstName(String memberFirstName) {
		this.memberFirstName = memberFirstName;
	}
	public String getMemberLastName() {
		return memberLastName;
	}
	public void setMemberLastName(String memberLastName) {
		this.memberLastName = memberLastName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getMemberDOB() {
		return memberDOB;
	}
	public void setMemberDOB(String memberDOB) {
		this.memberDOB = memberDOB;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<Friend> getFriendsList() {
		return friendsList;
	}
	public void setFriendsList(List<Friend> friendsList) {
		this.friendsList = friendsList;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
}
