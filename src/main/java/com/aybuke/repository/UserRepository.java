package com.aybuke.repository;

import com.aybuke.entity.Subject;
import com.aybuke.entity.User;
import com.aybuke.utility.MyFactoryRepository;

public class UserRepository extends MyFactoryRepository <User,Long> {
    public UserRepository() {
        super(new User());
    }
}
