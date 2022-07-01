package com.ranyk.ssm.vo;

import com.ranyk.ssm.entity.Course;
import com.ranyk.ssm.entity.Student;
import com.ranyk.ssm.entity.Teacher;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * CLASS_NAME: CourseSelectionVo.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 学生选课信息VO  <br/>
 * @date: 2022-06-30 <br/>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CourseSelectionVo extends Course implements Serializable {
    @Serial
    private static final long serialVersionUID = 2444314200431149324L;

    /**
     * 课程教授教师信息
     */
    private Teacher teacher;
    /**
     * 课程选修学生信息 List 集合, 单个参见 {@link  Student}
     */
    private List<Student> students;

}
