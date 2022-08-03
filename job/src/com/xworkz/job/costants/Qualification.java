package com.xworkz.job.costants;

public enum Qualification {
	BE("Be"),BCA("Bca"),BSC("Bsc");
	
	String qualifi;
	
	Qualification(String qualifi){
		this.qualifi=qualifi;
	}
	public String getQualifi() {
		return qualifi;
	}
}

