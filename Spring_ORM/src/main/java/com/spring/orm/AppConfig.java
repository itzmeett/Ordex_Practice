package com.spring.orm;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.spring.orm")
public class AppConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
	}
	
	@Bean
	public Properties hibernateProperties() {
	    Properties properties = new Properties();
	    properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
	    properties.setProperty("hibernate.show_sql", "true");
	    properties.setProperty("hibernate.format_sql", "true");
	    properties.setProperty("hibernate.hbm2ddl.auto", "update");
	    properties.setProperty("hibernate.current_session_context_class", "org.springframework.orm.hibernate5.SpringSessionContext");

	    return properties;
	}


	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan("com.spring.orm.entity"); 
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
	    HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	    transactionManager.setSessionFactory(sessionFactory);
	    return transactionManager;
	}

}
