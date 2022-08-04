package com.xworkz.politician.constants;

public enum MysqlProperties {
URL("jdbc:mysql://localhost:3306/politician"),
USERNAME("root"),
SECRATE("Arjunxwork");
	private	String value;
	private MysqlProperties(String value) {
		this.value=value;
		
		
	}
	public String getvalue(){
			return value;
		}
	
		
	}

