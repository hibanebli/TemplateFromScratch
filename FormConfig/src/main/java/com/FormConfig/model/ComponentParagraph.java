package com.FormConfig.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="paragraph")
public class ComponentParagraph {
	
	private String texte;
	private String idtemplate;

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}
	

	public String getIdtemplate() {
		return idtemplate;
	}

	public void setIdtemplate(String idtemplate) {
		this.idtemplate = idtemplate;
	}



	
	
}
