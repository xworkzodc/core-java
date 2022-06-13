package com.xworkz.basic_java.AtmByInterface;
import java.util.*;
public class Details implements Atm{

	@Override
	public void atm() {
		 System.out.println("Welcome to SBI ATM");
	      
         System.out.println("select 1 for Withdraw");  
         System.out.println("select 2 for Deposit");  
         System.out.println("select 3 for Check Balance");  
         System.out.println("select 4 for EXIT");  
         Scanner in=new Scanner(System.in);
        
         int select =in.nextInt();
         if (select==1) {
         	System.out.println("Please Enter Your Pin");
         	int pin=in.nextInt();                                     // importent
         	if (pin>=9999) {
             System.out.println("Please Enter Your Ampunt : Your Amount Should Be Under 10000");
             int amount=in.nextInt();
         		if (amount>=10000) {
         			System.out.println("Collect your Cash");
         		}
         		else{
         			System.out.println("Your Are Wrong Try Again");
         		}
         	}
         	else{
         			System.out.println("Your Are Wrong");
         		}
         }
        else if (select==2) {
        		System.out.println("Please Enter Your 8 Digit Account Number ");
        		int account=in.nextInt(); 
        		if (account>=99999999) {
        			System.out.println("Successfully Deposit");
        		}
        		else{
        			System.out.println("You Are Wrong");
        		}
        }
        else if (select==3) {
        	System.out.println("Please Enter Your Pincode ");
        	int pincode=in.nextInt();
        	if (pincode>=9999) {
        		System.out.println("Your Ammount is 100000000");
        		
        	}
        	else{
        		System.out.println("You Are Wrong");
        	}


        }
        else{

         System.out.println("Thank You");   

	}
		
	}

}
