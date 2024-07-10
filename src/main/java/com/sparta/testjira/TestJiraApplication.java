package com.sparta.testjira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJiraApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJiraApplication.class, args);
        test();
        test1();

    }

    public static void test() {
        System.out.println("test");
    }

    public static void test1() {
        System.out.println("test");
    }
    public static void test2() {
        System.out.println("test");
    }

}