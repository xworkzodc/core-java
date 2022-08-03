package com.xworkz.constent;

public enum Mysql_properties {
URL("jdbc:mysql://localhost:3306/ciggarate"),USERNAME("root"),SECERET("Arjunxwork");
	String value;
	Mysql_properties(String value){
		this.value=value;
		
		
	}
	 public String getvalue() {
		   return value;
	   }
}
