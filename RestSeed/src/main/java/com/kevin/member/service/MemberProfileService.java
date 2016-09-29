package com.kevin.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kevin.member.domain.Friend;
import com.kevin.member.domain.User;
import com.kevin.member.repository.MemberProfileRepository;

@Component
public class MemberProfileService {
	
	@Autowired
	MemberProfileRepository memberProfileRepository;
	
	public User getMemberProfile(String memberId) {
		
		return memberProfileRepository.getMemberProfile(memberId);
	}
	
	public List<Friend> getMemberFriendList(String memberId) {
		
		return memberProfileRepository.getMemberFriendList(memberId);
	}
}
