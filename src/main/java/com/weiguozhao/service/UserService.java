package com.weiguozhao.service;

import com.weiguozhao.pojo.User;

public interface UserService {
    int addUser(User user);

    User findUser(User user);

    boolean updateUser(User user);
}
