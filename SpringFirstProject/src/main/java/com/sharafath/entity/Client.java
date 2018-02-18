package com.sharafath.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		Employee e1 = new Employee();
		e1.setAddress("Thandalam");
		e1.setEid(1);
		e1.setName("REC");
		System.out.println("Value"+e1);*/
		
		//Spring IOC
		
		Resource res = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		Employee e2 = (Employee) factory.getBean("emp");
		
		System.out.println(e2);
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Employee e3 = (Employee) ctx.getBean("emp");
		
		System.out.println(e3);
		
		ClassPathXmlApplicationContext ctx1 = (ClassPathXmlApplicationContext) ctx;
		
		ctx1.close();
	}

}
