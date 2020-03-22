package com.meritamerica.assignment4;

/**
 * This class has a public modifier and the main method which is the entry point of Merit America Bank. 
 * It calls and uses other classes and methods.
 * @author Huy Cam
 */

public class MeritAmericaBankApp {
	public static void main(String[] args) {
//		try {
//			// read files
//			MeritBank.readFromFile("test.txt");
//			
//			
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
//		} catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		// test writer
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
    	boolean result = MeritBank.readFromFile("test.txt");
		
    	System.out.println(result);
	}
	     
}