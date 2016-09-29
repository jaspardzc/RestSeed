package com.kevin.member.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kevin.member.domain.Friend;
import com.kevin.member.domain.User;
import com.kevin.member.repository.meta.MemberFriendsMetaRepo;
import com.kevin.member.repository.meta.MemberProfileMetaRepo;

@Repository
public class MemberProfileRepository {
	
	@Autowired
	MemberProfileMetaRepo memberProfileMetaRepo;
	
	@Autowired
	MemberFriendsMetaRepo memberFriendsMetaRepo;
	
	public User getMemberProfile(String memberId) {
		
		return memberProfileMetaRepo.findByMemberId(memberId);
	}
	
	public List<Friend> getMemberFriendList(String memberId) {
		
		return memberFriendsMetaRepo.findByMemberIdAndActiveTrue(memberId);
	}
}
