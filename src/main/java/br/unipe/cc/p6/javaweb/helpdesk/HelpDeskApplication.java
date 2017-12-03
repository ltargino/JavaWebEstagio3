package br.unipe.cc.p6.javaweb.helpdesk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@EnableTransactionManagement
@EntityScan(basePackages = {"br.unipe.cc.p6.javaweb.helpdesk.model"})
@EnableJpaRepositories(basePackages = {"br.unipe.cc.p6.javaweb.helpdesk.dao"})
@ComponentScan({"br.unipe.cc.p6.javaweb.helpdesk.controller",
				"br.unipe.cc.p6.javaweb.helpdesk.dao",
				"br.unipe.cc.p6.javaweb.helpdesk.model",
				"br.unipe.cc.p6.javaweb.helpdesk.service",
				"br.unipe.cc.p6.javaweb.helpdesk.configuration",
				"br.unipe.cc.p6.javaweb.helpdesk.interceptor"})
public class HelpDeskApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelpDeskApplication.class, args);
	}
}
