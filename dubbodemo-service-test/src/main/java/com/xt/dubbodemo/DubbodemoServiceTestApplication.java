package com.xt.dubbodemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 主程序
 */
public class DubbodemoServiceTestApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans-provider.xml");
        ioc.start();

        System.in.read();
    }
}
