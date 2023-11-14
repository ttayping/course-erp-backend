package com.webperside.courseerpbackend.models.mybatis.teacher;


import com.webperside.courseerpbackend.models.mybatis.base.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TeachersSchedule extends BaseEntity<Long> {
    Long branchId;
    DayOfWeek dayOfWeek;
    LocalDateTime startTime;
    LocalDateTime endTime;
}
