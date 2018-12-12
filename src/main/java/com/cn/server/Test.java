package com.cn.server;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:springmvc.xml");
		context.start();
		
		//@Service("111222333AddSUMSer")
		AddNumServer addNumServer=(AddNumServer) context.getBean("wmcaddSUMServer");
		
		System.out.println(addNumServer.sum(2, 5, 6));
		
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
