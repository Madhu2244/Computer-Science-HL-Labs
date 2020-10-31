/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount implements Comparable
{  

 	private String name; // First Last
   	private double balance; 
   	private String number;
   /**
      Constructs a bank account with a zero balance.
      @param acctNumber the account number
      @param acctName the accountholder's name
   */
   public BankAccount(String acctNumber, String acctName)
   {  
   	  name = acctName;
      balance = 0;
      number = acctNumber;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
      @param acctNumber the account number
      @param acctName the accountholder's name
   */
   public BankAccount(double initialBalance, String acctNumber, String acctName)
   {  
      balance = initialBalance;
      name = acctName;
      number = acctNumber;
   }
 
   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount) 
   {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount) 
   {  
      balance = balance - amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {  
      return balance; 
   }
   
   /**
    * returns the accountholder name
    * @return the name
    */
   public String getName()
   {
   	return name;
   }
   
   /**
    * returns the account number
    * @return the account number;
    */
   public String getNumber()
   {
   	return number;
   }
   
   /**
      Transfers money from the bank account to another account
      @param amount the amount to transfer
      @param other the other account
   */
   public void transfer(double amount, BankAccount other)
   {  
      withdraw(amount);
      other.deposit(amount);
   }
   
   /**
    * compares BankAccount objects according to the account number
    * @param o the account to compare to
    * @return the difference between the account numbers
    */
   public int compareTo(Object o)
   {
   		// fix
   		return 0;
   }
   
   /**
    * determines that two BankAccounts are equal if ALL 3 fields match
    * @return whether the accounts are the same
    * @param o the BankAccount to compare to
    */
   public boolean equals(Object o)
   {
   		// fix
   		return true;
   }
   
   /**
    * returns the String version of the BankAccount
    * @return the String version of the account
    */
   public String toString()
   {
   		//use String.format (similar to printf) to format
   		//- is for left justification, s for String, f for floating point 
   		return String.format("%-20s  %8s  $%10.2f",name,number,balance);		 
   }
}
