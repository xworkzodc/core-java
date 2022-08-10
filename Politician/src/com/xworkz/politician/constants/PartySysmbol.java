package com.xworkz.politician.constants;

public enum PartySysmbol {
	BJP("lotus"), CONGRESS("panja"), BSP("elephant") ,SP("bycycle"),APNADAL("umbrella"),AAP("broom"),NISAD("boat"),KJP("coconout"),SIV("laptop"),KYLP("mobile") ;
   
	private String sysmbol;
	
    private	PartySysmbol(String sysmbol){
		this.sysmbol=sysmbol;
		
	}
    
    public String getsymbol() {
    	return sysmbol;
    
    }
    public static PartySysmbol getPartySymbol(String sysmbol) {
    	PartySysmbol[] partysysmbols=PartySysmbol.values();
		for(PartySysmbol partySysm1:partysysmbols) {
			if(partySysm1.sysmbol.equals(partysysmbols));
			return partySysm1;
			}
		return null;
    }
	
}


