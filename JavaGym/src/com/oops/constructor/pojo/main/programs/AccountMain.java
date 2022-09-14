package com.oops.constructor.pojo.main.programs;

import com.oops.constructor.pojo.sub.programs.Account;

public class AccountMain {

	public static void main(String[] args) {
		// Create a new class for a bank account
		// Create fields for the account number, balance, customer name, email and phone
		// number.
		//
		// Create getters and setters for each field
		// Create two additional methods
		// 1. To allow the customer to deposit funds (this should increment the balance
		// field).
		// 2. To allow the customer to withdraw funds. This should deduct from the
		// balance field,
		// but not allow the withdrawal to complete if their are insufficient funds.
		// You will want to create various code in the Main class (the one created by
		// IntelliJ) to
		// confirm your code is working.
		// Add some System.out.println's in the two methods above as well.
		
		

		Account customer = new Account("1200-2438-5342-8765", 5000.00, "Bob", "bob90@gnail.com",
				"9449376899");
		
		//Account cust = new Account();
		
		System.out.println("Your Name:               "+customer.getCustomerName());
		System.out.println("You A/c No:              "+customer.getAccountNumber());
		System.out.println("Your Current Balance:    "+customer.getBalance());
		customer.deposit(50000);
		customer.withdrawal(10000);
		customer.withdrawal(100000);
		
		System.out.println();
		System.out.println();
		
		//Let's update the constructor defaulted customer data:
		
		customer.setCustomerName("Bom Brix");
		customer.setAccountNumber("1200-5040-1280-6004");
		customer.setCustomerEmailAddress("bob.brix90@gmail.com");
		customer.setCustomerPhoneNumber("9446753899");
		customer.setBalance(10000);
		
		System.out.println("Your Name:               "+customer.getCustomerName());
		System.out.println("You A/c No:              "+customer.getAccountNumber());
		System.out.println("Your Current Balance:    "+customer.getBalance());
		customer.deposit(50000);
		customer.withdrawal(10000);
		customer.withdrawal(500000);

	}

}
