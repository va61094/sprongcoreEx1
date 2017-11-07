package com.accenture.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.bean.Employee;

public class CCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext application= new ClassPathXmlApplicationContext("app.xml");
		//spring container starts
		//bean objects are managed by the bean context
		
		Employee eref=application.getBean("eid",Employee.class);
		eref.getCCInfo();
		eref.getEmpInfo();
	}

}
