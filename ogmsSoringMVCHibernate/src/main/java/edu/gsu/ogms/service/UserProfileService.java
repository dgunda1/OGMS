package edu.gsu.ogms.service;

import java.util.List;

import edu.gsu.ogms.model.UserProfile;
 
 
public interface UserProfileService {
 
    UserProfile findById(int id);
 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
     
}