package com.ranyk.ssm.vo;

import com.ranyk.ssm.entity.Teacher;
import lombok.Data;

import java.util.List;

/**
 * CLASS_NAME: TeacherTeachingVo.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 教师教学信息VO  <br/>
 * @date: 2022-06-30 <br/>
 */
@Data
public class TeacherTeachingVo {

    private Teacher teacher;

    private List<CourseSelectionVo> courses;
}
