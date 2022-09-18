package com.xworkz.mobile.runner;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mobile.configuration.MobileConfiguration;
import com.xworkz.mobile.entity.MobileEntity;
import com.xworkz.mobile.service.MobileService;

public class MobileRunner {

	public static void main(String[] args) {
		MobileEntity entity = getMobileEntity();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobileConfiguration.class);
		MobileService bean = context.getBean(MobileService.class);
		bean.validateAndSave(entity);
		// System.out.println(context);
		System.out.println("manoj");

	}

	private static MobileEntity getMobileEntity() {
		MobileEntity entity = new MobileEntity(1, "ma", 1.02, "latha", "sowmya", LocalDate.now(), LocalDate.now());

		return entity;
	}

}
