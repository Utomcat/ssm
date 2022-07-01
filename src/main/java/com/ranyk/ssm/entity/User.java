package com.ranyk.ssm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/**
 * CLASS_NAME: User<br/>
 * Description: 用户实体对象<br/>
 *
 * @author ranYk <br/>
 * @version 1.0
 * @date 2021 - 09 - 02 <br/>
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("sys_user")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 3559914667481191591L;

    /**
     * 数据主键ID
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 逻辑删除标志, deleted=1/true: 已删除; deleted=0/false: 未删除;
     */
    private boolean deleted = Boolean.FALSE;

}
