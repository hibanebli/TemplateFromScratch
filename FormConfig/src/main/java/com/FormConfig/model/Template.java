package com.FormConfig.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.UnwindOperation;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.FormConfig.annotation.CascadeSave;

@Document(collection="template")
public class Template {

	@Id
	private String id;	
	private String author;
	private String templatename;
	private String typetemp;
	
	//@CascadeSave
	@Field		
	private ArrayList<Component> structure;
	

	//@DBRef
	/*@CascadeSave
	@Field("piechart")
	private ComponentPiechart pchart;
	//@DBRef
	@CascadeSave
	@Field("linechart")
	private ComponentLinechart lchart;
	
	@CascadeSave
	@Field("paragraph")
	private ComponentParagraph paragraph;
	
	
	public ComponentPiechart getPchart() {
		return pchart;
	}
	public void setPchart(ComponentPiechart pchart) {
		this.pchart = pchart;
	}
	public ComponentLinechart getLchart() {
		return lchart;
	}
	public void setLchart(ComponentLinechart lchart) {
		this.lchart = lchart;
	}*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

	
	public String getTemplatename() {
		return templatename;
	}
	public void setTemplatename(String templatename) {
		this.templatename = templatename;
	}
/*	public ComponentParagraph getParagraph() {
		return paragraph;
	}
	public void setParagraph(ComponentParagraph paragraph) {
		this.paragraph = paragraph;
	}*/
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTypetemp() {
		return typetemp;
	}
	public void setTypetemp(String typetemp) {
		this.typetemp = typetemp;
	}
	
	
	public ArrayList<Component> getStructure() {
		return structure;
	}
	public void setStructure(ArrayList<Component> structure) {
		this.structure = structure;
	}
	public void addcomponent(Component m) {
		this.structure.add(m);
	}
	public Template(String id, String author, String templatename, String typetemp,ArrayList<Component> structure) {
		super();
		this.id = id;
		this.author = author;
		this.templatename = templatename;
		this.typetemp = typetemp;
		this.structure = structure;
	}
	/*UnwindOperation unwindOperation = Aggregation.unwind("structure");
	Aggregation aggregation = Aggregation.newAggregation(unwindOperation);
	private MongoOperations mongoOperations;
	AggregationResults<Template> results=mongoOperations.aggregate(aggregation,"template", Template.class);
*/
	
	
	
	
}
