package com.oops.constructor.pojo.sub.programs;

public class Account {
	private String Accountnumber;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	/*
	 * public Account() { this("1010-2020-3030-8080", 5000.00, "Bob",
	 * "bob90@gnail.com", "9449376899"); }
	 */

	public Account(String Accountnumber, double balance, String customerName, String customerEmailAddress,
			String customerPhoneNumber) {
		this.Accountnumber = Accountnumber;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
	}

	public void withdrawal(double withdrawalAmount) {
		if (this.balance - withdrawalAmount < 0) {
			System.out.println("Only " + this.balance + " available. Withdrawal not processed");
		} else {
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + " processed, Remaining balance = " + this.balance);
		}
	}

	public String getAccountNumber() {
		return Accountnumber;
	}

	public void setAccountNumber(String Accountnumber) {
		this.Accountnumber = Accountnumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
}
