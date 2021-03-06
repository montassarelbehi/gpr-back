package tn.msis.gpr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaRepositories
public class GprProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(GprProjectApplication.class, args);
	}
}