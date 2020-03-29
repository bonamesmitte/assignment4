package com.meritamerica.assignment4;

import java.util.Queue;

/**
 * This class has a public modifier and the main method which is the entry point of Merit America Bank. 
 * It calls and uses other classes and methods.
 * @author Huy Cam
 */

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		try {
			// read files
//			boolean result = MeritBank.readFromFile("testRead.txt");
//			
//			System.out.println(result);
//			// test getting CDOfferings data
//			CDOffering[] offerings = MeritBank.getCDOfferings();
//			for (CDOffering o: offerings) {
//				System.out.println(o.getTerm() + ", " + o.getInterestRate());
//			}
//			
//			// test Account holder and checking Acount
//			AccountHolder[] acc = MeritBank.getAccountHolders();
//			for (AccountHolder a: acc) {
//				System.out.println(a.getFirstName() + ", " + a.getMiddleName() + ", " + a.getLastName() + ", " + a.getSSN());
//				CheckingAccount[] checkings = a.getCheckingAccounts();
//				for (CheckingAccount checking: checkings) {
//					if (checking == null) {
//						break;
//					}
//					System.out.println(checking.getAccountNumber() + ", " + checking.getBalance() + "," + checking.getInterestRate());
//				}
//			}
			
			AccountHolder accountHolder = new AccountHolder(
	            	"Sadiq",
	            	"",
	            	"Manji",
	            	"123456789");
	    	
	    	CDAccount cdAccount = accountHolder.addCDAccount(new CDOffering(5, 0.03), 10000);
//	        
	        System.out.println(cdAccount.withdraw(500.0));
		} catch(Exception e) {
			e.printStackTrace();
		}
//		
		// test writer
//		MeritBank.writeToFile("writingTest.txt");
		
		
		/*
		 * Testing other features
		 */
		 //Instantiating the SimpleDateFormat class
//	      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//	      //Parsing the given String to Date object
//	      try {
//	    	  Date date = formatter.parse("01/01/2020");
//	    	  System.out.println("Date object value: "+date);
//	      } catch(Exception e) {
//	    	  e.printStackTrace();
//	      }
    	
		// Used Class.method to read data
//    	boolean result = MeritBank.readFromFile("test.txt");
		
//    	System.out.println(result);
//		try {
//			AccountHolder accountHolder = new AccountHolder(
//	            	"Sadiq",
//	            	"",
//	            	"Manji",
//	            	"123456789");
//	    	SavingsAccount savingsAccount = accountHolder.addSavingsAccount(50);
//	    	System.out.println("hello3");
//	    	System.out.println(savingsAccount.withdraw(500.00));
//	    	
//		} catch(Exception e) {
//			System.out.println(e);
//		}
		
	}
	     
}