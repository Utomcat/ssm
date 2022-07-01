package com.ranyk.ssm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ranyk.ssm.entity.Course;
import com.ranyk.ssm.vo.CourseSelectionVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    /**
     * 通过教师ID,查询该教师对应的教学课程和对应课程选修的学生信息
     *
     * @param teacherId 教师ID
     * @return 返回查询结果 List 集合, 单个参见 {@link CourseSelectionVo} 对象
     */
    List<CourseSelectionVo> selectTeachingInfoByTeacherId(@Param("teacherId") Integer teacherId);
}
