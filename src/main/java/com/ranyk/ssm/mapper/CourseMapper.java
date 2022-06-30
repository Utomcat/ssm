package com.ranyk.ssm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ranyk.ssm.entity.Course;
import org.springframework.stereotype.Repository;

/**
 * CLASS_NAME: CourseMapper.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 课程表数据库操作层  <br/>
 * @date: 2022-06-30 <br/>
 */
@Repository
public interface CourseMapper extends BaseMapper<Course> {
}
