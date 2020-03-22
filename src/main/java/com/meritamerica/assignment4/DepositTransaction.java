package com.meritamerica.assignment4;

public class DepositTransaction {
	private BankAccount account;
	private double depositAmount;
	
	DepositTransaction(BankAccount targetAccount, double amount) {
		this.account = targetAccount;
		this.depositAmount = amount;
	}
	
	
}
