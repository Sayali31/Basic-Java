package sayali;

import java.util.Scanner;

public class VendingMc {
	public static void main(String[] args) {
		System.out.println("Welcome...!!!");
		double mn = menu();
		double price = retrievePrice(mn);
		
	}
	public static double menu(){
	    Scanner mn = new Scanner(System.in);
	    double choice = 0 ;
	    System.out.println("\n\nPlease enter the menu:"
	                + "\n1: Choclate \t 10"
	                + "\n2: ColdDrink \t 20"
	                + "\n3: Biscuits \t 6.5"
	                + "\n4: Exit ");
	    
	    choice = mn.nextDouble();
	    return choice; 
	    //mn.close();
	}
	public static double retrievePrice(double menuChoice){
	    if (menuChoice == 1) {
	    	//System.out.println("Prize is 10");
	    	return 10;
	    	}
	        
	    if (menuChoice == 2){
	    	//System.out.println("Prize is 20");
	    	return 20;	
	    	}
	        
	    if (menuChoice == 3){
	    	//System.out.println("Prize is 6.5");
	    	return 6.5;
	    	}
	        
	    else return 0;
	}
	
}
