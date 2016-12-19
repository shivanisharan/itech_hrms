package com.itech.hrms.dao;

import java.util.List;

import com.itech.hrms.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
