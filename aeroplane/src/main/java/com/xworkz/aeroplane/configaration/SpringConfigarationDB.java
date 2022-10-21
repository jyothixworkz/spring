package com.xworkz.aeroplane.configaration;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class SpringConfigarationDB {
	public SpringConfigarationDB() {
		System.out.println(" nanu db");
		// TODO Auto-generated constructor stub
	}

	@Bean
	LocalContainerEntityManagerFactoryBean bean(DataSource source) {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPackagesToScan("com");
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		bean.setDataSource(source);

		HashMap<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("hibernate.show_sql", true);
		bean.setJpaPropertyMap(map);

		return bean;
	}

	@Bean
	DataSource source() {

		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/shirt");
		source.setPassword("manoj@123");
		source.setUsername("root");

		return source;
	}

}
