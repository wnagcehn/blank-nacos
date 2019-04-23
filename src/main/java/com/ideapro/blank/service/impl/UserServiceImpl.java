package com.ideapro.blank.service.impl;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.ideapro.blank.common.Exception.BizException;
import com.ideapro.blank.model.entity.UserEntity;
import com.ideapro.blank.model.vo.UserVo;
import com.ideapro.blank.repository.IUserRepository;
import com.ideapro.blank.service.IUserService;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void insert(UserEntity entity){
        userRepository.insert(entity);
    }

    @Override
    public List<UserVo> query(Map<String, Object> param){
        List<UserEntity> list = userRepository.query(param);
        if (CollectionUtils.isEmpty(list)){
            throw new BizException("未查到任何用戶！");
        }
        List<UserVo> voList = new ArrayList<UserVo>();
        for (UserEntity entity : list) {
            UserVo vo = new UserVo();
            try {
                PropertyUtils.copyProperties(vo, entity);
            } catch (Exception e) {
                logger.error("转换出错：", e);
            }
            voList.add(vo);
        }
        return voList;
    }

}
