package com.ranyk.ssm;

import com.alibaba.fastjson.JSON;
import com.ranyk.ssm.entity.User;
import com.ranyk.ssm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * SsmApplicationTests 项目测试类
 *
 * @author ranYk
 * @version V1.0
 * @date 2022-06-25
 */
@Slf4j
@SpringBootTest
class SsmApplicationTests {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    void contextLoads() {
        List<User> users = userService.getAll();
        users.forEach(user -> log.info("当前查询到的 user 对象为: {}", JSON.toJSONString(user)));
    }

}
