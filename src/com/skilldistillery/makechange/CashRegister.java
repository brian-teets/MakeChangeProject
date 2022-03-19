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
			System.out.println(" *** Change to give back to the customer: *** "); 
			// TODO Seem to need some way of storing current count or tally and continuing to make change 
				// test conditions in assignment will only check up through amount tendered of 20.00 
			double changeRequired = amountTendered - purchasePrice; 
			int dollars = (int)changeRequired; 
			float cents = (float)(changeRequired - dollars); // SD John suggested float to declare cents 
				// as it would be a more accurate estimate
			int fiftyDollarBill = dollars / 50;
			int twentyDollarBill = (dollars % 50) / 20; 
			int tenDollarBill = (dollars % 50 % 20) / 10; 
			int fiveDollarBill = ((dollars % 50 % 20) % 10) / 5; // (dollars % 10) / 5;
			int oneDollarBill =  ( (dollars % 50 % 20 % 10 % 5) ) / 1;  // ((dollars % 10) % 5 ) / 1; 
			int quarter = (int)(cents / 0.25); // cents was declared as a float, so must cast an int, 
				// since we're using decimals now 
			int dime = (int)((cents % 0.25) / 0.10); 
			int nickel = (int)(((cents % 0.25) % 0.10 ) / 0.05);  
			int penny = (int)Math.round(( cents % 0.25 % 0.10 % 0.05 ) / 0.01 );  
			
			if(fiftyDollarBill > 0) {
				System.out.println(fiftyDollarBill + " fifty dollar bill "); 
			}
			if(twentyDollarBill > 0) {
				System.out.println(twentyDollarBill + " twenty dollar bill "); 
			}
			if(tenDollarBill > 0) {  
				System.out.println(tenDollarBill + " ten dollar bill ");
			} 
			if(fiveDollarBill > 0) {
				System.out.println(fiveDollarBill + " five dollar bill "); 
			}
			if(oneDollarBill > 0) {
				System.out.println(oneDollarBill + " one dollar bill "); 
			}
			if(quarter > 0) {
				System.out.println(quarter + " quarter "); 
			}
			if(dime > 0) {
				System.out.println(dime + " dime "); 
			}
			if(nickel > 0) {
				System.out.println(nickel + " nickel "); 
			}
			if(penny > 0) {
				System.out.println(penny + " penny "); 
			} 
		}

		// TODO don't forget to close the scanner!
		sc.close();
	}  // end of main method 

}  // end of CashRegister class 
