package com.lostsys.sample.hexagonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

@Configuration
@Primary
public class MongoDBConfig {

    @Bean
    public SimpleMongoClientDbFactory mongoDbFactory() {
        return new SimpleMongoClientDbFactory("mongodb://localhost:27017/mydatabase");
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoDbFactory());
    }
}
