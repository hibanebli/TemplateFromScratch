package com.FormConfig.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FormConfig.model.Template;

public interface FormConfigRepository extends MongoRepository<Template, String> {
    Template findTemplateById(String id);
}
