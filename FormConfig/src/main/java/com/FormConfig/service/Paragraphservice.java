package com.FormConfig.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FormConfig.model.Component;
import com.FormConfig.model.ComponentParagraph;
import com.FormConfig.model.Template;
import com.FormConfig.repo.FormConfigRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class Paragraphservice {

	@Autowired 
	private FormConfigRepository configrepo;
	
	@Autowired
	private FormConfigService configservice;
	

	public void addParagraph( ComponentParagraph paragraph ) {

		ObjectMapper oMapper = new ObjectMapper();	
		paragraph.setIdtemplate(configservice.currentID);
		Template template = configrepo.findTemplateById(paragraph.getIdtemplate());
		
		Map <String,Object> map = oMapper.convertValue(paragraph, Map.class);
		
		Component component = new Component(map);
		
		ArrayList<Component> list = new ArrayList<Component>();
		list.add(component);
		if (template.getStructure()==null) {
			template.setStructure(list);
			System.out.println(template.getStructure());
		}
		else {
		template.addcomponent(component);}
		configrepo.save(template);
	}
}
