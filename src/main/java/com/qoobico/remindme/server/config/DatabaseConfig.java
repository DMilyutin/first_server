package com.qoobico.remindme.server.config;


import jdk.nashorn.internal.objects.annotations.Property;
import org.omg.CORBA.Environment;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("com.qoobico.remindme.server.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("com.qoobico.remindme.server")
public class DatabaseConfig {

    @Resource
    private Environment env;
}
