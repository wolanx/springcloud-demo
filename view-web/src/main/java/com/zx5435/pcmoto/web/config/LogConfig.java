package com.zx5435.pcmoto.web.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfig {

    final public static Logger log = LoggerFactory.getLogger(LogConfig.class);

    @Bean
    public void logMethod() {
        log.info("==========print log==========");
    }

}
