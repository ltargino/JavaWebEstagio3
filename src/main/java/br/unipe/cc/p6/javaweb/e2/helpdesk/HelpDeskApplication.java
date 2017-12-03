package br.unipe.cc.p6.javaweb.e2.helpdesk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"br.unipe.cc.p6.javaweb.e2.helpdesk.controller", "br.unipe.cc.p6.javaweb.e2.helpdesk.dao", "br.unipe.cc.p6.javaweb.e2.helpdesk.model", "br.unipe.cc.p6.javaweb.e2.helpdesk.service", "br.unipe.cc.p6.javaweb.e2.helpdesk.interceptors"})
@EntityScan(basePackages = {"br.unipe.cc.p6.javaweb.e2.helpdesk.model"})
@EnableJpaRepositories(basePackages = {"br.unipe.cc.p6.javaweb.e2.helpdesk.dao"})
@EnableTransactionManagement
public class HelpDeskApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelpDeskApplication.class, args);
	}
}
