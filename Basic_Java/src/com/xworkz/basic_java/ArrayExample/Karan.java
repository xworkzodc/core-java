	package com.xworkz.basic_java.ArrayExample;

public class Karan {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int[] a;
		a=new int[4];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
System.out.println(a[3]);*/
		int[]a =new int [4];
		int num=1;
		for(int i=1;i<a.length ;i++) {
			a[i]=num;
			num++;
		}
			for(int i=0;i<a.length ;i++) {
				
				System.out.println(a[i]);	
			
			
		}
	}

}
