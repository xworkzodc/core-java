package com.xworkz.basic_java.Interface_Test;

public class TexCalculator implements StateTaxt,CentralText{

	@Override
	public void ptl() {
		System.out.println("petrol text is 10 rs");
	}

	@Override
	public void ec() {
		System.out.println("ereltricity text is 20 rs");
	}

}
