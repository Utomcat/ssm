package com.ranyk.ssm.api;

import com.ranyk.ssm.common.Response;
import com.ranyk.ssm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CLASS_NAME: TeacherApi.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 教师请求接口  <br/>
 * @date: 2022-06-30 <br/>
 */
@RestController
public class CourseApi {

    /**
     * 课程业务操作对象
     */
    private CourseService courseService;

    /**
     * 业务操作对象注入 set 方法
     *
     * @param courseService 业务操作对象
     */
    @Autowired
    public void setTeacherService(CourseService courseService) {
        this.courseService = courseService;
    }

    /**
     * 通过教师 ID 查询对应课程和对应课程选修学生信息
     *
     * @param teacherId 教师ID
     * @return 返回响应结果封装对象 {@link Response}
     */
    @GetMapping("getCourse")
    public Response getCourseByTeacherId(Integer teacherId) {
        return Response.builder().object(courseService.getTeachingByTeacherId(teacherId)).build();
    }
}
