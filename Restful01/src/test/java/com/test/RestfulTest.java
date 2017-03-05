package com.test;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

import com.isoft.UserServiceRestFul;

public class RestfulTest {
	public static void main(String[] args) {  
	    JAXRSServerFactoryBean jrf = new JAXRSServerFactoryBean();  
	    jrf.setResourceClasses(UserServiceRestFul.class);  
	    jrf.setResourceProvider(UserServiceRestFul.class,  
	            new SingletonResourceProvider(new UserServiceRestFul()));  
	    jrf.setAddress("http://localhost:8080/rest/");  
	    jrf.create();  
	}  
}
