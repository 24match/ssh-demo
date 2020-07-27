package com.liang.action;

import com.opensymphony.xwork2.ActionSupport;
import com.liang.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.liang.service.UserService;

/**
 * @Author
 * @Date
 */
public class TestAction extends ActionSupport {

    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String test() {
        UserEntity userEntity = new UserEntity();
        System.out.println(userEntity);
        return "test";
    }
}
