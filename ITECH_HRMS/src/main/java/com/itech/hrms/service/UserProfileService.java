package com.itech.hrms.service;

import java.util.List;

import com.itech.hrms.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
