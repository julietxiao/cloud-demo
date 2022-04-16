package com.gm;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages = "com.gm.mapper")//开启扫描Mapper接口的包以及子目录
@EnableSwagger2
public class CutterwareApplication {
    public static void main(String[] args) {
        SpringApplication.run(CutterwareApplication.class, args);
    }

}
