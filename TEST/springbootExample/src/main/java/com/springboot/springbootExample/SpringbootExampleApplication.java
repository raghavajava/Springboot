package com.springboot.springbootExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.springbootExample.com.search.BinearySearchApp;

@SpringBootApplication
public class SpringbootExampleApplication {

	public static void main(String[] args) {
		ApplicationContext cc=SpringApplication.run(SpringbootExampleApplication.class, args);
		BinearySearchApp binearySearchApp=  cc.getBean(BinearySearchApp.class);
		binearySearchApp.search();
	}

}
