package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author solargen
 * @version V1.0
 * @className PlatApplication
 * @description TODO
 * @date 2019/5/11
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2 //标识使用swagger生成接口文档
public class PlatApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatApplication.class,args);
    }

}
