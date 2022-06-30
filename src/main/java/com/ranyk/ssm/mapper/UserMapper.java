package com.ranyk.ssm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ranyk.ssm.entity.User;
import org.springframework.stereotype.Repository;

/**
 * CLASS_NAME: UserMapper.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 用户数据库操作对象  <br/>
 * @date: 2022-06-30 <br/>
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
