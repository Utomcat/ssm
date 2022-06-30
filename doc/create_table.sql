create TABLE teacher(
                        `id` bigint unsigned auto_increment primary key comment '数据主键ID',
                        `name` varchar(100) not null comment '姓名'
)engine=InnoDB DEFAULT CHARSET=UTF8 comment '教师表';

create TABLE course(
                       `id` bigint unsigned auto_increment primary key comment '数据主键ID',
                       `name` varchar(100) not null comment '课程名',
                       `teacher_id` bigint comment '所教教师ID'
)engine=InnoDB DEFAULT CHARSET=UTF8 comment '课程表';

create TABLE student(
                        `id` bigint unsigned auto_increment primary key comment '数据主键ID',
                        `name` varchar(100) not null comment '姓名'
)engine=InnoDB DEFAULT CHARSET=UTF8 comment '学生表';

create TABLE course_student(
                               `id` bigint unsigned auto_increment primary key comment '数据主键ID',
                               `course_id` bigint not null comment '课程ID',
                               `student_id` bigint not null comment '学生ID'
)engine=InnoDB DEFAULT CHARSET=UTF8 comment '学生-课程关系表';


INSERT INTO teacher (id, name) VALUES (1, '张三');
INSERT INTO teacher (id, name) VALUES (2, '李四');

INSERT INTO course (id, name, teacher_id) VALUES (1, '课程一', 1);
INSERT INTO course (id, name, teacher_id) VALUES (2, '课程一', 2);
INSERT INTO course (id, name, teacher_id) VALUES (3, '课程二', 1);


INSERT INTO course_student (id, course_id, student_id) VALUES (1, 1, 1);
INSERT INTO course_student (id, course_id, student_id) VALUES (2, 1, 3);
INSERT INTO course_student (id, course_id, student_id) VALUES (3, 2, 2);
INSERT INTO course_student (id, course_id, student_id) VALUES (4, 2, 1);
INSERT INTO course_student (id, course_id, student_id) VALUES (5, 3, 2);

INSERT INTO student (id, name) VALUES (1, '学生一');
INSERT INTO student (id, name) VALUES (2, '学生二');
INSERT INTO student (id, name) VALUES (3, '学生三');

