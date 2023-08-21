package com.lostsys.sample.hexagonal.infrastructura.outputadapter;

import com.lostsys.sample.hexagonal.infrastructura.outputport.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Primary
@Component
public class MongoRepository implements EntityRepository {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public MongoRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public <T> T save(T reg) {
        mongoTemplate.save(reg);
        return reg;
    }

    @Override
    public <T> T getById(String id, Class<T> clazz) {
        return mongoTemplate.findById(id, clazz);
    }

    @Override
    public <T> List<T> getAll(Class<T> clazz) {
        return mongoTemplate.findAll(clazz);
    }
}
