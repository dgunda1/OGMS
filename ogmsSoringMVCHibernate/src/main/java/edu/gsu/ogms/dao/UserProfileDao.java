package edu.gsu.ogms.dao;


import java.util.List;
 
import edu.gsu.ogms.model.UserProfile;
 
 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}