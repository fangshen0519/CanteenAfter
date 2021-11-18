package com.canteen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/** * SpringBoot引导类
 */
@SpringBootApplication
@MapperScan("com.canteen.demo.mapper")
public class CanteenSpringbootApplication {
    public static void main(String[] arg) {
        SpringApplication.run(CanteenSpringbootApplication.class);
    }
}
