package com.xt.dubbodemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * web 主程序
 */
public class DubbodemoWebTestApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans-consumer.xml");
        ioc.start();

        System.in.read();
    }
}
