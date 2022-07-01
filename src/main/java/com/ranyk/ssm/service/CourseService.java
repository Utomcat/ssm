package com.ranyk.ssm.service;


import com.ranyk.ssm.exception.ParameterException;
import com.ranyk.ssm.mapper.CourseMapper;
import com.ranyk.ssm.vo.CourseSelectionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * CLASS_NAME: TeacherService.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 课程业务接口  <br/>
 * @date: 2022-06-30 <br/>
 */
@Service
public class CourseService {

    /**
     * 数据库操作对象
     */
    private CourseMapper courseMapper;

    /**
     * 数据库操作注入 set 方法
     *
     * @param courseMapper 数据库操作对象
     */
    @Autowired
    public void setTeacherMapper(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    /**
     * 通过教师 ID 查询对应课程以及选修学生信息
     *
     * @param teacherId 教师ID
     * @return 返回查询结果 List 集合, 单个对象参见 {@link  CourseSelectionVo}
     */
    public List<CourseSelectionVo> getTeachingByTeacherId(Integer teacherId) {
        if (null == teacherId) {
            throw new ParameterException("未传入教师ID");
        }
        List<CourseSelectionVo> selectionVos = courseMapper.selectTeachingInfoByTeacherId(teacherId);
        if (null == selectionVos || selectionVos.size() == 0) {
            selectionVos = new ArrayList<>(1);
        }
        return selectionVos;
    }

}
