package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot02Helloword2Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot02Helloword2Application.class, args);
        System.out.println("测试git");
        System.out.println("第三次测试git");
        System.out.println("测试合并分支");
        System.out.println("hot-fix test!");
         System.out.println("测试-----------------");
        System.out.println("测试使用pull拉去远程库!");
        System.out.println("第二次测试使用push");
    }

}
