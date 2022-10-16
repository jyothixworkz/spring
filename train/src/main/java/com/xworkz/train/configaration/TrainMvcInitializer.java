package com.xworkz.train.configaration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TrainMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {
	private Class[] ServletConfigClasses = { SpringConfigaration.class };
	private String[] ServletMappings = { "/" };

	public TrainMvcInitializer() {
		System.out.println("trainmvcinitializer is created hen evaga" + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("nanu barala hen evaga");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("nanu getservaletconfigclass");
		// TODO Auto-generated method stub
		return ServletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("nanu getservaletmappings hen evaga");
		// TODO Auto-generated method stub
		return ServletMappings;
	}
  @Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	  System.out.println("nanu enable madde");
	configurer.enable();
}

}
