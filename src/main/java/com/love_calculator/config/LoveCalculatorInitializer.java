package com.love_calculator.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		// ============= For WEB BAsed ===============
//		XmlWebApplicationContext context = new XmlWebApplicationContext();
//		context.setConfigLocation("classpath:spring-servlet.xml");
		
		
		
		// ============= For Java Based ================
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);
		
		
		// create a dispatcher servlet object 
		
		DispatcherServlet dispatcher = new DispatcherServlet(webApplicationContext); 
		
		// register dispatcher servlet with servlet context 
		ServletRegistration.Dynamic myCustomDispatcherName = servletContext.addServlet("myDispatcher", dispatcher);
		
		myCustomDispatcherName.setLoadOnStartup(1);
		myCustomDispatcherName.addMapping("/");
		
		
		
		
		
		
	}

}
