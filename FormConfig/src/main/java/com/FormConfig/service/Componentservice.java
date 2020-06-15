package com.FormConfig.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FormConfig.model.Component;
import com.FormConfig.model.Template;
import com.FormConfig.repo.FormConfigRepository;

@Service
public class Componentservice {

		@Autowired
		private FormConfigRepository configrepo;

	public void addComponent(Map <String,Object> map , String id) {
		
		Template template = configrepo.findTemplateById(id);
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
