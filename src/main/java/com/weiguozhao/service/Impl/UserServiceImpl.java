package com.weiguozhao.service.Impl;

import com.weiguozhao.mapper.UserMapper;
import com.weiguozhao.pojo.User;
import com.weiguozhao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        int i = userMapper.insertUser(user);
        return i;
    }

    @Override
    public User findUser(User user) {
        User finduser = userMapper.findUser(user);
        return finduser;
    }

    @Override
    public boolean updateUser(User user) {
        int i = userMapper.updateUser(user);
        if (i!=0){
            return true;
        }
        return false;
    }
}
