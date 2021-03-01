package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * redis 配置属性类
 *
 * @author 程序员小强
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.redis")
public class RedisConfigProperty {

    /**
     * host 地址
     */
    private String host;

    /**
     * 连接密码（默认为空）
     */
    private String password;

    /**
     * 数据库索引（默认为0）
     */
    private int database;

    /**
     * 端口
     */
    private int port;

    /**
     * 连接超时时间（毫秒）
     */
    private int timeout;

}