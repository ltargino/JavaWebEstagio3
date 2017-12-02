package br.unipe.cc.p6.javaweb.e2.helpdesk.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.unipe.cc.p6.javaweb.e2.helpdesk.interceptors.LoginInterceptor;

@EnableAutoConfiguration
@Configuration
@ComponentScan({"br.unipe.cc.p6.javaweb.e2.helpdesk.interceptors"})
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Autowired
	LoginInterceptor loginInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginInterceptor);
	}	
	
}
