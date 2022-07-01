package com.ranyk.ssm;

import com.alibaba.fastjson.JSON;
import com.ranyk.ssm.entity.User;
import com.ranyk.ssm.service.CourseService;
import com.ranyk.ssm.service.UserService;
import com.ranyk.ssm.vo.CourseSelectionVo;
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

    /**
     * 用户业务操作对象
     */
    private UserService userService;
    /**
     * 课程业务操作对象
     */
    private CourseService courseService;

    /**
     * 用户业务操作对象注入 set 方法
     *
     * @param userService 用户业务操作对象
     */
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 课程业务操作对象注入 set 方法
     *
     * @param courseService 课程业务操作对象
     */
    @Autowired
    public void setTeacherService(CourseService courseService) {
        this.courseService = courseService;
    }

    /**
     * 获取所有用户数据测试方法
     */
    @Test
    void contextLoads() {
        List<User> users = userService.getAll();
        users.forEach(user -> log.info("当前查询到的 user 对象为: {}", JSON.toJSONString(user)));
    }

    /**
     * 根据查询课程、教授教师、选修学生信息测试方法
     */
    @Test
    void test0() {
        List<CourseSelectionVo> teaching = courseService.getTeachingByTeacherId(1);
        log.info("查询数据: {}", JSON.toJSONString(teaching));
    }

}
