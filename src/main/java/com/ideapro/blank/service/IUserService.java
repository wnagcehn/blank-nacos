package com.ideapro.blank.service;

import com.ideapro.blank.model.entity.UserEntity;
import com.ideapro.blank.model.vo.UserVo;

import java.util.List;
import java.util.Map;


public interface IUserService {

    /**
     * 新增
     * @param entity
     */
    void insert(UserEntity entity);

    /**
     * 查询
     * @param param
     * @return List<UserVo>
     */
    List<UserVo> query(Map<String, Object> param);

}
