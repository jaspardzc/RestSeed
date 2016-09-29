package com.kevin.member.repository.meta;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kevin.member.domain.Friend;

public interface MemberFriendsMetaRepo extends MongoRepository<Friend, String> {
	
	public List<Friend> findByMemberIdAndActiveTrue(String memberId);
}
