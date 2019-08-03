package com.springboot.springbootExample.com.search;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SearchGateway {
	
	public static void main(String[] args) {
		
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		BinearySearchApp binearySearchApp= (BinearySearchApp) factory.getBean("searchApp");
		
		binearySearchApp.search();
	}

}
