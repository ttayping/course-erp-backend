package com.webperside.courseerpbackend.services.appconfig;

import com.webperside.courseerpbackend.models.mybatis.appconfig.AppConfig;

import java.util.List;

public interface AppConfigService {

    List<AppConfig> findAll();

    AppConfig findById(Long id);

    void insert(AppConfig appConfig);

    void update(AppConfig appConfig);
}
