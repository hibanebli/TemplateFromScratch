package com.FormConfig.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FormConfig.model.Component;
import com.FormConfig.model.ComponentPiechart;
import com.FormConfig.model.Template;
import com.FormConfig.repo.FormConfigRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class Piechartservice {
 
	@Autowired 
	private FormConfigRepository configrepo;
	
	@Autowired
	private FormConfigService configservice;
	
	public void addPiechart( ComponentPiechart pchart ) {

		ObjectMapper oMapper = new ObjectMapper();	
		pchart.setIdtemplate(configservice.currentID);
		Template template = configrepo.findTemplateById(pchart.getIdtemplate());
		
		Map <String,Object> map = oMapper.convertValue(pchart, Map.class);
		
		Component component = new Component(map);
		
		ArrayList<Component> list = new ArrayList<Component>();
		list.add(component);
		
		if (template.getStructure()==null) {
			template.setStructure(list);
			System.out.println(template.getStructure());
		}
		
		else {
		template.addcomponent(component);
		}
		
		configrepo.save(template);
	}
}
