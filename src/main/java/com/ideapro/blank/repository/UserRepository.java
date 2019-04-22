package com.ideapro.blank.repository;

import com.ideapro.blank.model.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository(value = "userRepository")
public interface UserRepository {

    void insert(UserEntity entity);

    List<UserEntity> query(UserEntity entity);
}
