package com.cognizant.spring_learn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

 private static final Logger lg=LoggerFactory.getLogger(Country.class);
	String code;
	String name;
	Country(){
	 lg.debug("Inside Country constructor");
	}
	public String getCode() {
		lg.debug("Inside getCode()");
		return code;
	}
	public String getName() {
		lg.debug("inside getName()");
		return name;
	}
	public void setCode(String code) {
		lg.debug("inside setCode()");
	this.code=code;
	}
	public void setName(String name) {
		lg.debug("inside setName()");
		this.name=name;
	}
	public String toString() {
		return "country[code:"+code+", name:"+name+"]";
	}
}
