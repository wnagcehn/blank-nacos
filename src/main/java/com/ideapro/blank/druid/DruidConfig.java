package com.ideapro.blank.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;


/**
 * 配置druid需要的配置类，引入application.yml文件中以spring.datasource开头的信息
 * 因此需要在application.yml文件中配置相关信息。
 */
@Configuration
public class DruidConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }
}
