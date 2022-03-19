package com.skilldistillery.makechange;

import java.util.Scanner; 

public class CashRegister {

	public static void main(String[] args) {
		// For this hw, it is okay to have everything inside main
			// creating other methods is optional 
		
		Scanner sc = new Scanner(System.in); 
		
		double purchasePrice = 0; // initial price of the item 
		double amountTendered = 0; // representing how much money was tendered by the customer 
		// TODO add sc variable
		// TODO prompt the user to enter the price of the item 
		System.out.println("Please enter the purchase price of your item: "); 
		double userInput = sc.nextDouble(); 
		// reassign purchasePrice to the value of the userInput
		purchasePrice = userInput; 
		
		// TODO don't forget to close the scanner!!! 
		sc.close(); 
	}

}
