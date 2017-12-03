package br.unipe.cc.p6.javaweb.helpdesk.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.unipe.cc.p6.javaweb.helpdesk.interceptor.LoginInterceptor;

@Configuration
public class AppSettings extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor());
	}	
	
}
