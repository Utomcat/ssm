package com.ranyk.ssm.service;

import com.ranyk.ssm.entity.User;
import com.ranyk.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CLASS_NAME: UserService.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 用户业务接口  <br/>
 * @date: 2022-06-30 <br/>
 */
@Service
public class UserService {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 查询 sys_user 所有数据
     *
     * @return 返回查询到的所有数据 List 集合,单个对象参见 {@link  User}
     */
    public List<User> getAll() {
        return userMapper.selectList(null);
    }
}
