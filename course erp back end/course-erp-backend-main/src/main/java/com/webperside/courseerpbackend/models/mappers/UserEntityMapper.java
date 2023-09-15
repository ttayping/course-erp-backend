package com.webperside.courseerpbackend.models.mappers;

import com.webperside.courseerpbackend.models.enums.user.UserStatus;
import com.webperside.courseerpbackend.models.mybatis.user.User;
import com.webperside.courseerpbackend.models.payload.auth.SignUpPayload;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserEntityMapper {

    UserEntityMapper INSTANCE = Mappers.getMapper(UserEntityMapper.class);

    @Mapping(target = "password", source = "encryptedPassword")
    @Mapping(target = "status", constant = "ACTIVE")
    @Mapping(target = "roleId", source = "roleId")
    User fromSignUpPayloadToUser(SignUpPayload payload, String encryptedPassword, Long roleId);

}
