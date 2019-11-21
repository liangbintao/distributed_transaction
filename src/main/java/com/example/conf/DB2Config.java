package com.example.conf;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description TODO
 * @Author bingfeng
 * @Date 2019/11/20 17:06
 */
@Data
@ConfigurationProperties(prefix = "spring.datasource.db2")
public class DB2Config {

    @Value("${spring.datasource.db2.jdbc-url}")
    private String url_jdbc;

    @Value("${spring.datasource.db2.username}")
    private String username;

    @Value("${spring.datasource.db2.password}")
    private String password;
}
