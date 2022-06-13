package com.xworkz.basic_java.Pattern3usingInterface;

public class Cda  implements Abc , Bcd{
//char E=5;
	@Override
	public void Bc() {
	for(char i='A';i<='E'; i++) {
		
	 for(char j='A'; j<=i; j++) 
	 {
		 System.out.print(i);
	}
		
	 System.out.println();
	}
		
	}

	@Override
	public void ab() {
		// TODO Auto-generated method stub
		System.out.println("pattern");
	}
 
}
