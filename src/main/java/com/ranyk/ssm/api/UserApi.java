package com.ranyk.ssm.api;

import com.ranyk.ssm.common.Response;
import com.ranyk.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CLASS_NAME: UserApi.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 用户对象请求接口  <br/>
 * @date: 2022-06-30 <br/>
 */
@RestController
public class UserApi {
    /**
     * 用户业务对象
     */
    private UserService userService;

    /**
     * 用户业务对象 Set 方法
     *
     * @param userService 用户业务对象
     */
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 查询 所有 User 数据
     *
     * @return 返回响应封装对象,存放于 data 属性中
     */
    @GetMapping("getAll")
    public Response getAll(){
        return Response.valueOfDate(userService.getAll());
    }



}
