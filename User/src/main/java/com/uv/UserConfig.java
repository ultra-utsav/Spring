package com.uv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
@ComponentScan(basePackages = { "com.uv" })
@PropertySource("classpath:db.properties")
@EnableWebMvc
public class UserConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver irr = new InternalResourceViewResolver();
		irr.setPrefix("/WEB-INF/views/");
		irr.setSuffix(".jsp");

		return irr;
	}
}
