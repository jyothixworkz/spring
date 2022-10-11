package com.xworkz.milkshop.configuration;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println(" spring configaration class is created");

	}

	@Bean
	public ViewResolver resolver() {
		System.out.println(" it is my own view resolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

}
