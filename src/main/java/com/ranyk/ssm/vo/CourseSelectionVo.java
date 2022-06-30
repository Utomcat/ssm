package com.ranyk.ssm.vo;

import com.ranyk.ssm.entity.Course;
import com.ranyk.ssm.entity.Student;
import lombok.Data;

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
public class CourseSelectionVo implements Serializable {
    @Serial
    private static final long serialVersionUID = 2444314200431149324L;

    private Course course;

    private List<Student> students;

}
