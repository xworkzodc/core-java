package com.xworkz.bars.constant;

public enum Bartype {
WINESTORE("winestore"),RESORT("resort"),BAR_RESTURANT("bar_resturent"),MSIL("msil"),DEFAULT("resturant");
	
private	String name;

private Bartype(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
	
}
