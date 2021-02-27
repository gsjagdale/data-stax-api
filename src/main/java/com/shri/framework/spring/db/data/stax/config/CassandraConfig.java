package com.shri.framework.spring.db.data.stax.config;

import java.nio.file.Paths;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CqlSessionFactoryBean;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;

import com.datastax.oss.driver.api.core.CqlSession;

@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {

	@Override
	protected String getKeyspaceName() {
		return "testKeySpace";
	}

	@Bean
	public CqlSessionFactoryBean cluster() {
		CqlSessionFactoryBean cluster = new CqlSessionFactoryBean();
		cluster.setContactPoints("127.0.0.1");
		cluster.setPort(9142);
		return cluster;
	}

	@Bean
	public CassandraMappingContext cassandraMapping() throws ClassNotFoundException {
		return new CassandraMappingContext();
	}

	@Override
	protected CqlSession getRequiredSession() {
		return CqlSession.builder().withCloudSecureConnectBundle(Paths.get("/home/shrikar/Downloads/secure-connect-gsjagdale.zip"))
				.withAuthCredentials("gsjagdale", "gsjagdale").build();
	}
}
