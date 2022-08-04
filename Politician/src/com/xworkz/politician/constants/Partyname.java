package com.xworkz.politician.constants;

public enum Partyname {
BJP("bjp"), CONGRESS("congress"), BSP("bsp") ,SP("sp"),APNADAL("apnadal"),AAP("aap"),NISAD("nisad"),KJP("kjp"),SIV("siv"),KYLP("kylp") ;
	
	private String party;
	
	private Partyname(String party){
		this.party=party;
		
		
	}
	public String getparty() {
		return party;
	}
	
}
