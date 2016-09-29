/*package com.kevin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

@Configuration
public class DatabaseConfiguration {

	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
		return SimpleMongoDbFactory(new MongoClient(), "restseeddb");
	}
	
	@Bean
	public MongoTemplate mongoTemplate() throws Exception {

		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());

		return mongoTemplate;
	}
}
*/