package com.hmall.user;

import com.hmall.user.config.JwtProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhangyu
 * @Date: 2025/08/12/11:16
 * @Description:
 */
@EnableFeignClients(basePackages = "com.hmall.api.client"/*,defaultConfiguration = DefaultFeignConfig.class需要日志输出就添上*/)
@MapperScan("com.hmall.user.mapper")
@SpringBootApplication
@EnableConfigurationProperties(JwtProperties.class)
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
