package com.ranyk.ssm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * CLASS_NAME: Course.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 课程实体类  <br/>
 * @date: 2022-06-30 <br/>
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("course")
public class Course implements Serializable {
    @Serial
    private static final long serialVersionUID = -4030005096649704560L;
    /**
     * 数据主键
     */
    private Integer id;
    /**
     * 课程名
     */
    private String name;
    /**
     * 任课教师ID
     */
    private Integer teacherId;

}
