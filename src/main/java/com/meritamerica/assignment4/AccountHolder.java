package com.meritamerica.assignment4;

        // Declare a class that implements an interface 
public class AccountHolder implements Comparable{ 
	
	    // Class member variables 
	 	private String firstName;
	    private String middleName;
	    private String lastName;
	    private String ssn;
	    private CheckingAccount[] checkingAccounts;
	    private SavingsAccount[] savingsAccounts;
	    private CDAccount[] CDAccounts;
	    private DepositTransaction []  checkingTrans;
	    private DepositTransaction []  savingsTrans;
	    private DepositTransaction []  cdTrans;
	    private int numOfCheckingTrans;
	    private int numOfSavingsTrans;
	    private int numOfCDTrans;
	    
	    // keep track of numbers of checkings and saving accounts
	    private int numberOfCheckings = 0;
	    private int numberOfSavings = 0;
	    private int numberOfCDAs = 0;
	    

	    
	    // Used split method to split a string into an array 
	    public static AccountHolder readFromString(String accountHolderData) {
	    	String[] data = accountHolderData.split(",");
	    	String firstName = data[0];
	    	String middleName = data[1];
	    	String lastName = data[2];
	    	String ssn = data[3];
	    	
	    	return new AccountHolder(firstName, middleName, lastName, ssn);
	    }
	    
	    // A constructor and parameters 
	    // [o, p, ,] [3]
	    AccountHolder (){
	    	this.numOfCheckingTrans = 0;
	    	this.numOfSavingsTrans = 0;
	    	this.numOfCDTrans = 0;
	    	
	    	checkingTrans = new DepositTransaction[10];
	    	savingsTrans = new DepositTransaction[10];
	    	cdTrans = new DepositTransaction[10];	    	
	    }
	    AccountHolder(String firstName, String middleName, String lastName, String ssn){
	    	this();
	    	
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	        this.ssn = ssn;
	        
	        // instantiate array of Checkings
	        checkingAccounts = new CheckingAccount[10];
	        savingsAccounts = new SavingsAccount[10];
	        CDAccounts = new CDAccount[10];
	        
	        
	        
	    }
	    
	    public void createCheckingArray(int numOfAccount) {
	    	this.checkingAccounts = new CheckingAccount[numOfAccount];
	    }
	    
	    public void createSavingArray(int numOfAccount) {
	    	this.savingsAccounts = new SavingsAccount[numOfAccount];
	    }
	    
	    public void createCDAccounts(int numOfAccount) {
	    	this.CDAccounts = new CDAccount[numOfAccount];
	    }
	    
	    
	    public String getFirstName() {
	        return firstName;
	    }
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    public String getMiddleName() {
	        return middleName;
	    }
	    public void setMiddleName(String middleName) {
	        this.middleName = middleName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public void setLastname(String lastName) {
	        this.lastName = lastName;
	    }
	    public String getSSN() {
	        return ssn;
	    }
	    public void setSSN(String ssn) {
	        this.ssn = ssn;
	    }

//	    @Override
//	    public String toString() {
//	        return "First Name:" + this.firstName + "\n"  + "Middle Name:" + this.middleName +  "\n"  + "Last Name:" + this.lastName
//	                +  "\n" + "SSN:" + this.ssn +  "\n"  +"Checking Account Balance:" + this.checkingAccount.getBalance() +
//	                "\n" + "Savings Account Balance:" + this.savingsAccount.getBalance();
//	    }
	    
	    
	    public CheckingAccount addCheckingAccount(double openingBalance) throws ExceedsCombinedBalanceLimitException {

	    	
	    	if (canOpen(openingBalance)) {
		    	// increment number of checkings
		    	this.numberOfCheckings++;
		    	
		    	CheckingAccount acc = new CheckingAccount(openingBalance);
		    	
		    	this.checkingAccounts[this.numberOfCheckings - 1] = acc;
		    	
//		    	this.checkingTrans[this.numOfCheckingTrans] = new DepositTransaction(acc, openingBalance);
//		    	
//		    	this.numOfCheckingTrans++;
		    	
		    	return checkingAccounts[this.numberOfCheckings - 1];
	    	} else {
	    		throw new ExceedsCombinedBalanceLimitException();

	    	}
	    	
	    }
	            
	          /*If combined balance limit is exceeded, throw ExceedsCombinedBalanceLimitException
Should also add a deposit transaction with the opening balance */
	    public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) throws ExceedsCombinedBalanceLimitException {
	    	// check the opening account condition
	    	if (canOpen(checkingAccount.getBalance())) {
		    	// increment numberOfCheckings currently have
		    	this.numberOfCheckings++;
		    	
		    	this.checkingAccounts[this.numberOfCheckings - 1] = checkingAccount;
		    	
		    	// add a deposit transaction with the opening balance
//		    	this.checkingTrans[this.numOfCheckingTrans] = new DepositTransaction(checkingAccount, checkingAccount.getBalance());
//		    	
//		    	this.numOfCheckingTrans++;
		    	
		    	return this.checkingAccounts[this.numberOfCheckings - 1];
	    	} else {
	    		throw new ExceedsCombinedBalanceLimitException();
	    	}
	    }
	    
	    public CheckingAccount[] getCheckingAccounts( ) {
	    	return this.checkingAccounts;
	    }
	    
	    public int getNumberOfCheckingAccounts() {
	    	return this.numberOfCheckings;
	    }
	    
	    public double getCheckingBalance() {
	    	double total = 0;
	    	for (int i=0; i < this.numberOfCheckings ; i++ ) {
	    		total += this.checkingAccounts[i].getBalance();
	    	}
	    	
	    	return total;
	    }
	    
	    /*If combined balance limit is exceeded, throw ExceedsCombinedBalanceLimitException
Should also add a deposit transaction with the opening balance */	    
	    public SavingsAccount addSavingsAccount(double openingBalance) throws ExceedsCombinedBalanceLimitException {
	    	
	    	if (canOpen(openingBalance)) {
	    		// increment numberOfSavings current have
		    	this.numberOfSavings++;
		    	
		    	SavingsAccount sav = new SavingsAccount(openingBalance);
		    	
		    	this.savingsAccounts[this.numberOfCheckings -1] = sav;
		    	
//		    	this.savingsTrans[this.numOfSavingsTrans] = new DepositTransaction(sav, openingBalance);
//		    	
//		    	this.numOfSavingsTrans++;
		    	
		    	this.savingsAccounts[this.numberOfSavings - 1] = new SavingsAccount(openingBalance);
		    	
		    	return this.savingsAccounts[this.numberOfSavings - 1];
	    	} else {
	    		throw new ExceedsCombinedBalanceLimitException(); 
	    	}
	   
	    	
	    }
	    
	    /*If combined balance limit is exceeded, throw ExceedsCombinedBalanceLimitException
Should also add a deposit transaction with the opening balance */
	    public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) throws ExceedsCombinedBalanceLimitException {
	    	// check if total amount is greater than 250, 000
	    	if (canOpen(savingsAccount.getBalance())) {
	    		this.numberOfSavings++;
		    	
		    	this.savingsAccounts[this.numberOfSavings - 1] = savingsAccount;
		    	
//		    	this.savingsTrans[this.numOfSavingsTrans] = new DepositTransaction(savingsAccount, savingsAccount.getBalance());
//		    	
//		    	this.numOfSavingsTrans++;
		    	
		    	return this.savingsAccounts[this.numberOfSavings - 1];
	    	} else {
	    		throw new ExceedsCombinedBalanceLimitException();
	    	}
	    	
	    	
	    	
	    }
	    
	    public SavingsAccount[] getSavingsAccounts() {
	    	
	    	
	    	
	    	return this.savingsAccounts;
	    }
	    
	    public int getNumberOfSavingsAccounts() {
	    	return this.numberOfSavings;
	    }
	    
	    public double getSavingsBalance() {
	    	double total = 0;
	    	for (int i=0; i < this.numberOfSavings; i++ ) {
	    		total += this.savingsAccounts[i].getBalance();
	    	}
	    	
	    	return total;
	    }
	    
	    // Should also add a deposit transaction with the opening balance
	    public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
	    	this.numberOfCDAs++;
	    	
	    	this.CDAccounts[this.numberOfCDAs - 1] = new CDAccount(offering, openingBalance);
	    	
	    	return this.CDAccounts[this.numberOfCDAs - 1];
	    	
	    }
	    
	    //Should also add a deposit transaction with the opening balance
	    public CDAccount addCDAccount(CDAccount cdAccount) {
	    	this.numberOfCDAs++;
	    	
	    	this.CDAccounts[this.numberOfCDAs - 1] = cdAccount;
	    	
	    	return this.CDAccounts[this.numberOfCDAs - 1];
	    }
	    
	    public CDAccount[] getCDAccounts() {
	    	return this.CDAccounts;
	    }
	    
	    public int getNumberOfCDAccounts() {
	    	return this.numberOfCDAs;
	    }
	    
	    public double getCDBalance() {
	    	double total = 0;
	    	for (int i=0; i < this.numberOfCDAs; i++ ) {
	    		total += this.CDAccounts[i].getBalance();
	    	}
	    	
	    	return total;
	    }
	    
	    public double getCombinedBalance() {
	    	return this.getCDBalance() + this.getCheckingBalance() + this.getSavingsBalance();
	    }
	    
	    // This method validates that the total amount of combined balance and deposit is less than $250,000.00
	    private boolean canOpen(double deposit) {
	    	if (this.getCombinedBalance() + deposit < 250000.00) {
	    		return true;
	    	} else {
	    		System.out.println("Total is over 250,000. Can not open a new account");
	    		return false;
	    	}
	    }

		@Override
		public int compareTo(Object o) {
			AccountHolder acc = (AccountHolder) o;
			if (this.getCombinedBalance() < acc.getCombinedBalance())
				return -1;
			else if (this.getCombinedBalance() > acc.getCombinedBalance())
				return 1;
			else
				return 0;
		}
}