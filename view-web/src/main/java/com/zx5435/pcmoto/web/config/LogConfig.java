package com.zx5435.pcmoto.web.config;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfig {

    final public static Logger log = (Logger) LoggerFactory.getLogger(LogConfig.class);

    @Bean
    public void logMethod() {
        log.info("==========print log==========");

//        Logger root = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
//        LoggerContext ctx = root.getLoggerContext();
//        ctx.reset();
//
//        PatternLayoutEncoder encode = new PatternLayoutEncoder();
//        encode.setContext(ctx);
//        encode.setPattern("%-5level %replace((%file:%line]){']', ')'} [%thread]: %message%n");
//        encode.start();
//
//        ConsoleAppender<ILoggingEvent> appender = new ConsoleAppender<>();
//        appender.setContext(ctx);
//        appender.setEncoder(encode);
//        appender.start();
//
//        root.addAppender(appender);
//
//        root.debug("Message 1");
//        root.warn("Message 2");
    }

}
