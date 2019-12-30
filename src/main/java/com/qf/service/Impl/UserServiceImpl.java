package com.qf.service.Impl;

import com.qf.entity.User;
import com.qf.mapper.UserMapper;
import com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weimin
 * @ClassName UserServiceImpl
 * @Description TODO
 * @date 2019/10/21 16:54
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
