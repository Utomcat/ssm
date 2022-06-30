package com.ranyk.ssm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ranyk.ssm.entity.CourseStudent;
import org.springframework.stereotype.Repository;

/**
 * CLASS_NAME: CourseStudentMapper.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 课程学生关系表数据库操作层  <br/>
 * @date: 2022-06-30 <br/>
 */
@Repository
public interface CourseStudentMapper extends BaseMapper<CourseStudent> {
}
