package com.weiguozhao.controller;

import com.weiguozhao.pojo.ResponseData;
import com.weiguozhao.pojo.User;
import com.weiguozhao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private User loginUser=null;
    @Autowired
    private UserService userService;
    @RequestMapping("/register")
    public ResponseData userRegister(User user){
        int i = userService.addUser(user);
        ResponseData responseData = new ResponseData();
        if (i!=0){
            responseData.setCode(1);
            return responseData;
        }
        return responseData;
    }

    @RequestMapping("/login")
    public ResponseData userLogin(User user){
        User user1 = userService.findUser(user);
        ResponseData responseData = new ResponseData();
        if (user1!=null){
            responseData.setCode(1);
            loginUser=user1;
            return responseData;
        }
        return responseData;
    }

    @RequestMapping("/denglu")
    public ResponseData userDengLu(){
        ResponseData responseData = new ResponseData();
        if (loginUser!=null){
            User user = userService.findUser(loginUser);
            responseData.setCode(1);
            responseData.setInfo(loginUser);
            return responseData;
        }
        return responseData;
    }

    @RequestMapping("/update")
    public ResponseData userUpdate(User user){
        user.setId(loginUser.getId());
        boolean flag = userService.updateUser(user);
        ResponseData responseData = new ResponseData();
        if (flag){
            responseData.setCode(1);
            loginUser.setTel(user.getTel());
        }
        return responseData;
    }
}
