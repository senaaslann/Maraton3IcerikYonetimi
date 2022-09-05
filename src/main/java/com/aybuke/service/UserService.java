package com.aybuke.service;

import com.aybuke.entity.Subject;
import com.aybuke.entity.User;
import com.aybuke.repository.SubjectRepository;
import com.aybuke.repository.UserRepository;
import com.aybuke.utility.MyFactoryService;

public class UserService extends MyFactoryService<UserRepository, User,Long> {

    public UserService() {
        super(new UserRepository());
    }
}
