package com.xworkz.basic_java.Pattern2usingInterface;

public class Star2 implements StarPattren {

	@Override
	public void astric() {
		for (int i=1; i<=4 ; i++ ) 
		{
			for (int j=4; j>=i ;j-- )
			 {
				System.out.print(" * ");
			 }
			System.out.println();
		}
		
	}

}
