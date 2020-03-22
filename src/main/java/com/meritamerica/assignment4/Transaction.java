package com.meritamerica.assignment4;

import java.util.Date;

public abstract class Transaction {
	private BankAccount sourceAccount;
	private BankAccount targetAccount;
	private double amount;
	private Date date;
	
	public Transaction(BankAccount sourceAccount, BankAccount targetAccount, double amount) {
		this.sourceAccount = sourceAccount;
		this.targetAccount = t
	}
	                   
	public BankAccount getSourceAccount() {
		return this.sourceAccount;
	}
	public void setSourceAccount(BankAccount account) {
		this.sourceAccount = account;
	}
	public BankAccount getTargetAccount() {
		return this.targetAccount;
	}
	public void setTargetAccount(BankAccount account) {
		this.targetAccount = account;
	}
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public java.util.Date getTransactionDate() {
		return this.date;
	}
	public void setTransactionDate(java.util.Date date) {
		this.date = date;
	}
	public String writeToString();
	public static Transaction readFromString(String transactionDataString);

	
	
	
	
	
}
