package com.simplifyforme.tableinheritancepostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.simplifyforme.tableinheritancepostgresql.repositories")
public class TableInheritancePostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(TableInheritancePostgresqlApplication.class, args);
	}

}
