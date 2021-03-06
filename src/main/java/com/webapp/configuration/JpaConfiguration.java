package com.webapp.configuration;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages= {"com.webapp.user.repository"})
@EnableTransactionManagement
public class JpaConfiguration {
	
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		
		LocalEntityManagerFactoryBean entityManager = new LocalEntityManagerFactoryBean();
		entityManager.setPersistenceUnitName("shopDB");
		
		return entityManager;
		
	}
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);

		return transactionManager;
	}

}
