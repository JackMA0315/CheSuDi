package com.weiguozhao.mapper;

import com.weiguozhao.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    int insertUser(User user);
    User findUser(User user);
}
