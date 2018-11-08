package cn.springboot_themeleaf_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootThemeleafJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThemeleafJpaApplication.class, args);
	}
}
