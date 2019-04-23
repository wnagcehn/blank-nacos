package com.ideapro.blank.repository;

import com.ideapro.blank.model.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository(value = "userRepository")
public interface IUserRepository {

    void insert(UserEntity entity);

    List<UserEntity> query(Map<String, Object> condition);
}
