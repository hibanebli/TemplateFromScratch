package com.FormConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.FormConfig.model.ComponentLinechart;
import com.FormConfig.model.ComponentPiechart;
import com.FormConfig.model.Template;
import com.FormConfig.repo.FormConfigRepository;

@SpringBootApplication
public class FormConfigApplication implements CommandLineRunner{
	
	@Autowired
	FormConfigRepository rep;
	@Autowired
	MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(FormConfigApplication.class, args);			
	}
	
	@Override
	public void run(String... args) throws Exception {
		//ComponentLinechart lchart = new ComponentLinechart(1,"productprice" , "productname" , "productcolor");
		//ComponentLinechart lchart2 = new ComponentLinechart("price","25","chrome");
	//	ComponentPiechart pchart2 = new ComponentPiechart("75","firefox");
		//Template temp = new Template("2","name","d@gmail.com",null,null,lchart);
		//Template t = new Template("3","new","r@gmail.com",null,pchart2,lchart);
		//Template t3 = new Template("4","temp","f@gmail.com",null,pchart2,lchart);
		//Template t4 = new Template ("5","factsheet","fr@gmail.com",null,pchart2,lchart2);
		//rep.save(temp);
		//rep.save(t);
		//rep.save(t3);
		//rep.save(t4);
		//mongoTemplate.insert(temp);
		
	}

}
