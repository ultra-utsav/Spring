package com.uv;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//widely used method
//public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer{
//
//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		// TODO Auto-generated method stub
//		return new Class[] {UserConfig.class};
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		// TODO Auto-generated method stub
//		return new String[] {"/"};
//	}
//
//}

public class FrontController implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		// using xml file
		// XmlWebApplicationContext context = new XmlWebApplicationContext();
		// context.setConfigLocation("classpath:configuration.xml");

		// using java based
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(UserConfig.class);
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic registration = servletContext.addServlet("frontcontroller", dispatcherServlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
	}

}