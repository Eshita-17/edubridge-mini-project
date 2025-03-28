package com;
import java.util.Scanner;

public class ATM {

    static int withdrawal = 0, deposit = 0, account = 100000, amt;
    static String username;

    public void displayDetails() {
        System.out.println("\nBank name 	: ABC Bank");
        System.out.println("Username	: " + username);
        System.out.println("Account balance	: ₹ " + account);
        System.out.println("Amount withdrawn: ₹ " + withdrawal);
        System.out.println("Amount deposited: ₹ " + deposit);
    }

    public void withdrawAmount(int amt) {
        if (amt > account) {
            System.out.println("Insufficient balance!");
        } else {
            account -= amt;
            withdrawal += amt;
            System.out.println("Withdrawal successful.");
            System.out.println("\n\n");
            displayDetails(); // Call displayDetails after withdrawal
        }
    }

    public void depositAmount(int amt) {
        if (amt <= 0) {
            System.out.println("Invalid amount! Amount must be positive.");
        } else {
            account += amt;
            deposit += amt;
            System.out.println("Deposit successful.");
            System.out.println("\n\n");
            displayDetails(); // Call displayDetails after deposit
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM obj = new ATM();

        int pin, choice;
        int attempts = 0; // To count the number of attempts

        System.out.println("		WELCOME TO ABC BANK! 			"); // Displaying the welcome message
        System.out.print("Enter your bank username: "); // Asking user to input username
        username = sc.next(); // Taking the input

        if (username.equalsIgnoreCase("ABC_BANK_USER")) { // Checking if the username is correct
            // Loop to allow the user up to 3 chances to input the correct PIN
            while (attempts < 3) {
                System.out.print("Welcome, user. \nPlease enter PIN: "); // Asking for the PIN
                pin = sc.nextInt(); // Taking the input

                if (pin == 1357) { // Correct PIN check
                    boolean running = true; // Variable to control the loop
                    while (running) { // Start loop for menu options
                        System.out.print("\n1. Check account balance. \n2. Withdraw money from account. \n3. Deposit money in account. \n4. Exit. \nEnter your choice: ");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:		obj.displayDetails(); // Call displayDetails for balance check
                            			break;

                            case 2:		System.out.println("Enter amount to be withdrawn: ");
                            			amt = sc.nextInt();
                            			obj.withdrawAmount(amt); // Withdrawal
                            			break;

                            case 3:		System.out.println("Enter amount to be deposited: ");
                            			amt = sc.nextInt();
                            			obj.depositAmount(amt); // Deposit
                            			break;

                            case 4:		System.out.println("		THANK YOU FOR VISITING ABC BANK! 			");
                            			running = false; // Exit the loop and terminate the program
                            			break;

                            default:	System.out.println("Invalid choice! Please select a valid option.");
                            			break;
                        }
                    }
                    break; // Exit the loop if PIN is correct
                } else {
                    attempts++; // Increment the number of attempts
                    System.out.println("Invalid PIN! You have " + (3 - attempts) + " attempt(s) left.");
                }
            }

            // If the user exceeds 3 attempts, print a message and exit
            if (attempts == 3) {
                System.out.println("Too many incorrect attempts! Your account is blocked.");
            }
        } else {
            System.out.println("Invalid username!");
        }
        sc.close(); // Close the scanner
    }
}
