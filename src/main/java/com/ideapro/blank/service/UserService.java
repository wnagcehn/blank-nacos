package com.ideapro.blank.service;

import com.ideapro.blank.model.entity.UserEntity;

import java.util.List;


public interface UserService {

    /**
     * 新增
     * @param entity
     */
    void insert(UserEntity entity);

    /**
     * 查询
     * @param entity
     * @return
     */
    List<UserEntity> query(UserEntity entity);

}
