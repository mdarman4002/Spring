package com.spring.expressionlang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/spring/expressionlang/expressionlang.xml");
		Demo demo = context.getBean("demo", Demo.class);
		System.err.println(demo);
	}

}
