package com.isoft;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

public class CXFMain{	
	
			public static void main(String[] args) {  
			    JAXRSServerFactoryBean jrf = new JAXRSServerFactoryBean();  
			    jrf.setResourceClasses(UserServiceRestFul.class);  
			    jrf.setResourceProvider(UserServiceRestFul.class,  
			    new SingletonResourceProvider(new UserServiceRestFul()));  
			    jrf.setAddress("http://localhost:8080/rest/");  
			    jrf.create();  
			}  
}
