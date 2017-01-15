package com.rolebase.service;

import com.rolebase.model.UserProfile;

import java.util.List;

/**
 * Created by dorsa on 1/11/17.
 */
public interface UserProfileService {
    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();
}
