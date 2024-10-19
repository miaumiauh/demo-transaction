package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Demo32Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo32Application.class, args);
	}

}
