package com.FormConfig.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

import com.FormConfig.model.Template;

public class TemplateCascadeSaveMongoEventListener extends AbstractMongoEventListener<Object>{
	
	 @Autowired
	    private MongoOperations mongoOperations;

	    @Override
	    public void onBeforeConvert(final BeforeConvertEvent<Object> event) {
	        final Object source = event.getSource();
	        if ((source instanceof Template)){
	          //  mongoOperations.save(((Template) source).getLchart());
	           // mongoOperations.save(((Template) source).getPchart());
	         
	        }
	    }

}
