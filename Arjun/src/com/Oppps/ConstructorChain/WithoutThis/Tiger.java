package com.Oppps.ConstructorChain.WithoutThis;

public class Tiger {
String name;
String color;
int num_of_tiger;

Tiger(String n, String c, int nt){
	name=n;
	color=c;
	num_of_tiger=nt;
	
	
}
void show() {
	System.out.println("name "+name+" color "+color +" num_of_tiger "+num_of_tiger);
}
}

