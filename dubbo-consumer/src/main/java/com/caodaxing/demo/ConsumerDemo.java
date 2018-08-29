package com.caodaxing.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("spring/spring-dubbo.xml");
		cpac.start();
        System.out.println("consumer start");
        DemoClass bean = cpac.getBean(DemoClass.class);
        bean.getprovider("caodaxing");
        
	}
	
}
