package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		// For this hw, it is okay to have everything inside main
			// creating other methods is optional

		Scanner sc = new Scanner(System.in);

		double purchasePrice = 0; // initial price of the item
		double amountTendered = 0; // representing how much money was tendered by the customer
		// TODO User Story #1: prompt the user to enter the price of the item
		System.out.println("Please enter the purchase price of the item: ");
		// TODO add scanner variable to store user input for price of item purchase
		double userInputPrice = sc.nextDouble();
		// reassign purchasePrice to the value of the userInput
		purchasePrice = userInputPrice;
		// TODO User Story #2: prompt user to ask how much money was tendered by the
			// customer
		System.out.println("How much money was tendered by the customer? ");
		// TODO add scanner variable to store user input for amount tendered by customer 
		double userInputAmt = sc.nextDouble();
		amountTendered = userInputAmt;
		// TODO User Story #3: Display an appropriate message IF the customer provided
			// too little ( < ) money, OR the exact amount.
		if (amountTendered == purchasePrice) {
			System.out.println("The customer supplied the exact amount. This transaction is complete! ");
		} 
		else if (amountTendered < purchasePrice) {
			System.out.println("The customer didn't supply enough money for the item purchased. ");
		}
		// TODO User Story #4: If the amount tendered is more than the cost of the item,
			// display the number of bills and coins that should be given to the customer. 
		else if(amountTendered > purchasePrice){
			System.out.println("The customer overpaid. You need to make change. ");
			System.out.println(" ... calculating change needed, one moment ... "); 
			// TODO Seem to need some way of storing current count or tally and continuing to make change 
				// test conditions in assignment will only check up through amount tendered of 20.00 
			double changeRequired = 0.0;
			double tenDollarBill = 0.0;
			double fiveDollarBill = 0.0;
			double quarter = 0.0;
			double dime = 0.0;
			double nickel = 0.0; 
			double penny = 0.0; 
			if(amountTendered % 20.0 == 0) {  // Check if amountTendered divisible by 20?
				
			} 
		}

		// TODO don't forget to close the scanner!
		sc.close();
	}  // end of main method 

}  // end of CashRegister class 
