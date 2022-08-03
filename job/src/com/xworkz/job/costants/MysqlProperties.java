package com.xworkz.job.costants;

public enum MysqlProperties {
URL ("jdbc:mysql://localhost:3306/job"),
USERNAME ("root"),
SECRET("Arjunxwok");
	
private	String value;
	
	MysqlProperties(String value){
		this.value=value;
	}
	public String getValue() {
		return value;
	}
	
	
}
