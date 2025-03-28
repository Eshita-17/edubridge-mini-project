# ATM Console Application - ABC Bank

Description

This is a simple console-based ATM application developed in Java. The program simulates basic banking operations such as checking the account balance, withdrawing money, and depositing money into the account. It also includes a user authentication system with a username and PIN check.

Features

  User Authentication: Users can log in with a predefined username and PIN.
  
  Account Balance: Displays the current account balance.
	
 Withdrawals: Allows users to withdraw money from their account if sufficient funds are available.
	
 Deposits: Users can deposit money into their account.
	
 Security: The user has three attempts to input the correct PIN. After three incorrect attempts, the account gets blocked.
	
 Interactive Console Interface: The program provides a simple text-based interface for the user to interact with.

 Code Overview
 
 ATM Class
 
   Variables:
   
   withdrawal: Tracks the total amount withdrawn by the user.
			
   deposit: Tracks the total amount deposited by the user.
		
   account: Stores the current balance of the user's account.
		
   username: Stores the user's account username.
		
   amt: Used to store the amount for transactions.
   
   Methods:
   
   displayDetails(): Displays the account details including balance, withdrawals, and deposits.
	
   withdrawAmount(int amt): Allows the user to withdraw a specified amount from the account.
		
   depositAmount(int amt): Allows the user to deposit a specified amount into the account.
   
   Main Method: 
   
   Handles user input for authentication (username and PIN), and provides a menu for users to interact with the ATM system.

Acknowledgements

The project was developed as part of a mini project to simulate a basic ATM system using Java. Thanks to the open-source community for inspiration and resources.
