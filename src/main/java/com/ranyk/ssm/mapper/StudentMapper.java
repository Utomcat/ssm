package com.ranyk.ssm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ranyk.ssm.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * CLASS_NAME: StudentMapper.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 学生表数据库操作层  <br/>
 * @date: 2022-06-30 <br/>
 */
@Repository
public interface StudentMapper extends BaseMapper<Student> {
}
