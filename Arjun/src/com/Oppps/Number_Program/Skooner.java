package com.Oppps.Number_Program;

public class Skooner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number=987654;
		  int reminder;
		  int revers=0;
		  for(; number!=0; number=number/10) {
			 reminder=number%10;
			  revers=revers*10+reminder;
			  
			  
			  
		  }
		  System.out.println("revers number is :"+revers);
	}

}
