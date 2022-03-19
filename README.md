## Make Change Project 

### Week 1 Homework for Skill Distillery 

## Overview 

Cash register simulator.

In the cash register we will calculate the amount of change returned to a customer based on the purchase price and the amount tendered. 

We will also notify the attendant how many of each piece of currency:
($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change for the customer. 

Change should be provided using the largest bill and coin denominations as possible. Denominations that are not used should not be displayed.

Hint: Mod operator 

## User Stories

User Story #1
The user is prompted asking for the price of the item.

User Story #2
The user is then prompted asking how much money was tendered by the customer.

User Story #3
Display an appropriate message if the customer provided too little money or the exact amount.

User Story #4
If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer. 

## How To Run The Program

* It is assumed the user has an IDE, such as Eclipse. 
* Download and install the .java file to local Eclipse workspace.
* Run the program

	* User / tester will be cash register attendant / cashier. 
	* When prompted, tester / attendant will enter a decimal number for the price of an item to purchase. Hit return.
	* When prompted, tester / attendant will enter a decimal number for how much was tendered by the customer. Hit return.
	* The program will now print out some information: 
		* If the amount tendered is less than the purchase price, then you will see a message that not enough money was tendered by the customer. 
		* If the amount tendered is exactly the amount of the purchase price, then you will see an appropriate message. 
		* If the amount tendered is greater than the amount of the purchased item price, then the program will print out the appropriate amount of change to give back to the customer.
		
* Note: This program does not have a loop implemented in the solution. To run various scenarios, the user will need to re-run the program. 

## Technologies / Skills Used 

* Java
* Eclipse
* git 
* GitHub 
* Slack
* Zoom  

## Lessons Learned 

* The modulus operator
* Don't stay stuck! Don't be afraid to ask for help. 

The modulus operator was very important to the implementation on this project. 

I got stuck for a while on how to approach User Story #4. Getting into a Zoom meeting room with one of the TAs and talking through the issue helped me considerably. SD John walked me through how to approach declaring my variables in my else if block using the modulus operator. Once he helped walk me through the first couple of declarations, the rest of the variable declaration expressions made a lot of sense. 
