package com.Oppps.ConstructorChain.methodCall_Usig_this;

public class Tiger {//this: to invoke current class method
	
	//this: to invoke current class method
	

   void	run(){
	   System.out.println("first::this: to invoke current class method");
		
	}
	void show() {
		System.out.println("Second::this: to invoke current class method");
		this.run();
	}
}
