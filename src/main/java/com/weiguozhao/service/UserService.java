package com.weiguozhao.service;

import com.weiguozhao.pojo.User;

public interface UserService {
    int addUser(User user);

    boolean findUser(User user);
}
