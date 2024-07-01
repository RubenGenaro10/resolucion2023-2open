package com.kaeser.platform.u202218996;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class U202218996Application {

	public static void main(String[] args) {
		SpringApplication.run(U202218996Application.class, args);
	}

}
