package com.webapp.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.setDisplayName("SampleWebapp");
		appContext.register(WebAppConfig.class);
		
		ServletRegistration.Dynamic webAppDispatcher = servletContext.addServlet("SpringDispatcher", 
				new DispatcherServlet(appContext));
		webAppDispatcher.setLoadOnStartup(1);
		webAppDispatcher.addMapping("/");
		
		
	}

}
