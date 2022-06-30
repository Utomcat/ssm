package com.ranyk.ssm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * CLASS_NAME: CourseStudent.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 学生课程关系表  <br/>
 * @date: 2022-06-30 <br/>
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("course_student")
public class CourseStudent implements Serializable {
    @Serial
    private static final long serialVersionUID = -484583342556669393L;
    /**
     * 数据主键ID
     */
    private Integer id;
    /**
     * 课程ID
     */
    private Integer courseId;
    /**
     * 选修学生ID
     */
    private Integer studentId;
}
