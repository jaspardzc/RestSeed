package com.kevin.member.repository.meta;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kevin.member.domain.User;

public interface MemberProfileMetaRepo extends MongoRepository<User, String> {
	
	public User findByMemberId(String memberId);
	
	public List<User> findAll();
	
}
