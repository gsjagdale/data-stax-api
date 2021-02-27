package com.shri.framework.spring.db.data.stax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories
public class DataStaxApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataStaxApiApplication.class, args);
	}

}
