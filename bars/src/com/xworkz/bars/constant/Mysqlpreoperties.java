package com.xworkz.bars.constant;

public enum Mysqlpreoperties {
URL("jdbc:mysql://localhost:3306/bar"),USERNAME("root"),SECRET("Arjunxwok");
	private String value;
	
	private Mysqlpreoperties(String value) {
		this.value=value;
		
	}
	public String getValue() {  //for getting values
		return value;
	}
}
