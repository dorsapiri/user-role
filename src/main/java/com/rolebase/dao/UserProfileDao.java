package com.rolebase.dao;

import com.rolebase.model.UserProfile;

import java.util.List;

/**
 * Created by dorsa on 1/11/17.
 */
public interface UserProfileDao {
    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
