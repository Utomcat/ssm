package com.ranyk.ssm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * CLASS_NAME: Student.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 学生实体类  <br/>
 * @date: 2022-06-30 <br/>
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("student")
public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 4209770041724233640L;
    /**
     * 数据主键ID
     */
    private Integer id;
    /**
     * 学生姓名
     */
    private String name;
}
