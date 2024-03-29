package com.zhang.community.service;

import com.zhang.community.mapper.UserMapper;
import com.zhang.community.model.User;
import com.zhang.community.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void createOrUpdate(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andAccountIdEqualTo(user.getAccountId());
        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() == 0){
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(user.getGmtCreate());
            userMapper.insert(user);
        }else {
            User dbUser = users.get(0);
            User updataUser = new User();
            updataUser.setGmtModified(System.currentTimeMillis());
            updataUser.setAvatarUrl(user.getAvatarUrl());
            updataUser.setName(user.getName());
            updataUser.setToken(user.getToken());
            UserExample example = new UserExample();
            example.createCriteria().andIdEqualTo(dbUser.getId());
            userMapper.updateByExampleSelective(updataUser,example);
        }

    }
}
