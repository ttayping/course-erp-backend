package com.webperside.courseerpbackend.models.mybatis.course;

import com.webperside.courseerpbackend.models.enums.course.CourseStatus;
import com.webperside.courseerpbackend.models.mybatis.base.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
// SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course extends BaseEntity<Long> {

    String name;
    CourseStatus status;

}
