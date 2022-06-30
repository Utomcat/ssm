package com.ranyk.ssm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * CLASS_NAME: Teacher.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 老师 实体类  <br/>
 * @date: 2022-06-30 <br/>
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("teacher")
public class Teacher implements Serializable {


    @Serial
    private static final long serialVersionUID = -4776723172720123709L;
    /**
     * 数据主键
     */
    private Integer id;
    /**
     * 教师姓名
     */
    private String name;

}
