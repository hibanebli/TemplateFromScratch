package com.FormConfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.FormConfig.events.TemplateCascadeSaveMongoEventListener;

@Configuration
public class MongoConfig {
	
	  @Bean
	    public TemplateCascadeSaveMongoEventListener templateCascadingMongoEventListener() {
	        return new TemplateCascadeSaveMongoEventListener();
	    }

}
