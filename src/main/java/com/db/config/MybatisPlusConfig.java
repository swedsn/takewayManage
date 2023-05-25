package com.db.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author swedsn
 * @version 1.0
 * @date 2023-05-24 15:41
 */

@MapperScan("com.db.mapper")
@EnableTransactionManagement
@Configuration
public class MybatisPlusConfig {

    //@Bean

}
