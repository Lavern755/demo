package com.example.demo.service.impl;

import com.example.demo.mapper.TUserMapper;
import com.example.demo.model.TUser;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/11/20.
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private TUserMapper userMapper;

    public TUser getUserById(Integer id){
        TUser user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}