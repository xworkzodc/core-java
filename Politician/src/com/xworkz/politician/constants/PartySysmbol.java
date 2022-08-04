package com.xworkz.politician.constants;

public enum PartySysmbol {
	BJP("lotus"), CONGRESS("panja"), BSP("elephant") ,SP("bycycle"),APNADAL("umbrella"),AAP("broom"),NISAD("boat"),KJP("coconout"),SIV("laptop"),KYLP("mobile") ;
   
	private String symbol;
	
    private	PartySysmbol(String sysmbol){
		this.symbol=symbol;
		
	}
    
    public String getsymbol() {
    	return symbol;
    }
    
	
	
}

