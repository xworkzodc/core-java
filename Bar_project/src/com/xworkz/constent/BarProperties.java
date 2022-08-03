package com.xworkz.constent;

public enum BarProperties {
	WINE("wine"),
	MSIL(" msil"),
	BAR_RESTURANT(" bar and resturent "),
	RESORT(" resort"),
	DEFAULT(" restrurent" );
	
    private String bartype;
	
	private BarProperties(String bartype) {
	 this.bartype=bartype;
	}
	
	
	public String getbar() {
		return bartype;
	}
}
