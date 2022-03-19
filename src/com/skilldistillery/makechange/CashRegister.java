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
			int dollars = (int)changeRequired; // casting and reassigning the value of changeRequired 
			float cents = (float)(changeRequired - dollars); // SD John suggested float to declare cents 
				// as it would be a more accurate estimate
			int hundredDollarBill = dollars / 100;
			int fiftyDollarBill =  (dollars % 100)  / 50;
			int twentyDollarBill = (dollars % 100 % 50) / 20; 
			int tenDollarBill = (dollars % 100 % 50 % 20) / 10; 
			int fiveDollarBill = ((dollars % 100 % 50 % 20) % 10) / 5; // (dollars % 10) / 5;
			int oneDollarBill =  ( (dollars % 100 % 50 % 20 % 10 % 5) ) / 1;  // ((dollars % 10) % 5 ) / 1; 
			int quarter = (int)(cents / 0.25); // cents was declared as a float, so must cast an int 
				// since we're using decimals now 
			int dime = (int)((cents % 0.25) / 0.10); 
			int nickel = (int)(((cents % 0.25) % 0.10 ) / 0.05);  
			int penny = (int)Math.round(( cents % 0.25 % 0.10 % 0.05 ) / 0.01 );  
			
			if(hundredDollarBill > 0) { 
				if(hundredDollarBill == 1) {
					System.out.println(hundredDollarBill + " hundred dollar bill");
				}
				else {
					System.out.println(hundredDollarBill + " hundred dollar bills"); 
				}
			}
			if(fiftyDollarBill > 0) { 
				if(fiftyDollarBill == 1) {
					System.out.println(fiftyDollarBill + " fifty dollar bill");
				}
				else {
					System.out.println(fiftyDollarBill + " fifty dollar bills"); 
				}
			}
			if(twentyDollarBill > 0) {
				if(twentyDollarBill == 1) {
					System.out.println(twentyDollarBill + " twenty dollar bill");
				}
				else {
					System.out.println(twentyDollarBill + " twenty dollar bills"); 
				}
			}
			if(tenDollarBill > 0) {  
				if(tenDollarBill == 1) {
					System.out.println(tenDollarBill + " ten dollar bill");
				}
				else {
					System.out.println(tenDollarBill + " ten dollar bills"); 
				}
			} 
			if(fiveDollarBill > 0) {
				if(fiveDollarBill == 1) {
					System.out.println(fiveDollarBill + " five dollar bill");
				}
				else {
					System.out.println(fiveDollarBill + " five dollar bills"); 
				} 
			}
			if(oneDollarBill > 0) {
				if(oneDollarBill == 1) {
					System.out.println(oneDollarBill + " one dollar bill");
				}
				else {
					System.out.println(oneDollarBill + " one dollar bills"); 
				}  
			}
			if(quarter > 0) {
				if(quarter == 1) {
					System.out.println(quarter + " quarter");
				}
				else {
					System.out.println(quarter + " quarters"); 
				} 
			}
			if(dime > 0) {
				if(dime == 1) {
					System.out.println(dime + " dime");
				}
				else {
					System.out.println(dime + " dimes"); 
				} 
			}
			if(nickel > 0) {
				if(nickel == 1) {
					System.out.println(nickel + " nickel");
				}
				else {
					System.out.println(nickel + " nickels"); 
				} 
			}
			if(penny > 0) {
				if(penny == 1) {
					System.out.println(penny + " penny "); 
				}
				else {
					System.out.println(penny + " pennies "); 
				}
			} 
		} // end of else if(amountTendered > purchasePrice) block 

		// TODO don't forget to close the scanner!
		sc.close();
	}  // end of main method 

}  // end of CashRegister class  
// TODO test conditions listed in Grading section of project  
/*
 * You will be given either a pass or fail based on whether your code works given all of the following test conditions:
 * 
 * Amount: .67, Tendered: .50, Result: Error message
 * Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
 * Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
 * Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
 * Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
 * 
 * If the project does work with all of the above test conditions, you will be given a 1 for this week's project.
 * 
 * If the project does not work with the above test conditions, you will be given a 0 for this week's project.
 * 
*/
