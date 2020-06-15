package com.FormConfig.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FormConfig.model.ComponentLinechart;
import com.FormConfig.model.Template;

public interface LinechartRepository extends MongoRepository<ComponentLinechart, String>{

}
