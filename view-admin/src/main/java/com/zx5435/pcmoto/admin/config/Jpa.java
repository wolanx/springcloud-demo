package com.zx5435.pcmoto.admin.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.DispatcherServlet;

import javax.sql.DataSource;

@Configuration
public class Jpa {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();

        emfb.setDataSource(dataSource);

        emfb.setJpaVendorAdapter(jpaVendorAdapter);

        emfb.setPackagesToScan("com.zx5435.pcmoto.admin.entity");
        return emfb;
    }

//    @Bean
//    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
//        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
//        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
//        return registration;
//    }

}
