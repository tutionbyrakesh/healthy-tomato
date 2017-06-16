package com.bytestree.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bytestree.restful.service.StudentService;

/**
 * 
 * @author BytesTree
 * http://www.bytestree.com/spring/restful-web-service-crud-operation-spring-boot-example/
 *
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		ApplicationContext context =SpringApplication.run(Application.class, args);
		System.out.println("*****************************");
		System.out.println(context.getBeanDefinitionCount());
		String[] beanNames = context.getBeanDefinitionNames();
		System.out.println("--------- Listing All bean names below ----------");
		for(String beanName:beanNames){
			System.out.println(beanName);
		}
		System.out.println("*****************************");
	}
}
