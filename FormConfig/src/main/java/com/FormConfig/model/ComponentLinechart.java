package com.FormConfig.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="line")
public class ComponentLinechart {
	
	//@Id
	//private String id;
	
	private int nb_columns;
	private String title_linechart;
	private String xAxis_linechart;
	private String yAxis_linechart;
	private String idtemplate;
	
	
	public String getTitle_linechart() {
		return title_linechart;
	}
	public void setTitle_linechart(String title_linechart) {
		this.title_linechart = title_linechart;
	}
	public String getxAxis_linechart() {
		return xAxis_linechart;
	}
	public void setxAxis_linechart(String xAxis_linechart) {
		this.xAxis_linechart = xAxis_linechart;
	}
	public String getyAxis_linechart() {
		return yAxis_linechart;
	}
	public void setyAxis_linechart(String yAxis_linechart) {
		this.yAxis_linechart = yAxis_linechart;
	}
	
	public int getNb_columns() {
		return nb_columns;
	}
	public void setNb_columns(int nb_columns) {
		this.nb_columns = nb_columns;
	}
	public String getIdtemplate() {
		return idtemplate;
	}
	public void setIdtemplate(String idtemplate) {
		this.idtemplate = idtemplate;
	}
	

	
	

}
