package com.caodaxing.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProvider {
	
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("spring/spring-dubbo.xml");
		System.out.println(cpac.getDisplayName() + ": here");
		cpac.start();
		System.out.println("server is start...");
		//阻塞方法,保持运行
		System.in.read();
	}

}
