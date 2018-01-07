package com.pe.ventas.facv2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsViewResolver;

import com.pe.ventas.facv2.propiedades.globalProperties;

import java.io.IOException;

import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "com.pe.ventas.facv2")
public class AppConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		super.addResourceHandlers(registry);
	}

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Bean
	public static DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://192.168.1.37:3306/bdventas");
		dataSource.setUsername("prueba");
		dataSource.setPassword("");
		return dataSource;
	}

	// JASPERREPORTS

//	@Bean
//	public JasperReportsViewResolver getJasperReportsViewResolver() {
//		JasperReportsViewResolver resolver = new JasperReportsViewResolver();
//		resolver.setPrefix("classpath:/jasper/");
//		resolver.setSuffix(".jasper");
//		resolver.setReportDataKey("datasource");
//		resolver.setViewNames("*_report");
//		resolver.setViewClass(JasperReportsMultiFormatView.class);
//		resolver.setOrder(1);
//		return resolver;
//	}

	// MULTIPARTRESOLVER

//	@Bean
//	public MultipartResolver multipartResolver() throws IOException {
//		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
//		multipartResolver.setMaxUploadSize((1024 * 1024) * 10);
//		return multipartResolver;
//	}

	// CONFIGURACION DE MULTIPARTRESOLVER PARA TRABAJAR CONN ARCHUIVOS--
	/*
	 * @Bean(name = "multipartResolver") public CommonsMultipartResolver
	 * getResolver() throws IOException { CommonsMultipartResolver resolver = new
	 * CommonsMultipartResolver(); // no limit resolver.setMaxUploadSize(500000);
	 * 
	 * return resolver; }
	 */

}
