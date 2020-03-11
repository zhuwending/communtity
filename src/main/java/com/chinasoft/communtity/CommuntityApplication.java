package com.chinasoft.communtity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//在该类的同一级或下级中的带有注解的文件都会自动加载进来
@SpringBootApplication
public class CommuntityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommuntityApplication.class, args);
    }

}
