package com.ideapro.blank.service.impl;

import com.ideapro.blank.model.entity.UserEntity;
import com.ideapro.blank.repository.UserRepository;
import com.ideapro.blank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void insert(UserEntity entity){
        userRepository.insert(entity);
    }

    @Override
    public List<UserEntity> query(UserEntity entity){
        return userRepository.query(entity);
    }

}
