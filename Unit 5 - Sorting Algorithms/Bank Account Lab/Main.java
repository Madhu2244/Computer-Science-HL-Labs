import java.util.Scanner;
import java.io.*;
/**
   This program tests the BankAccount class and
   its subclasses. 
*/
public class Main
{  
   public static void main(String[] args) throws IOException
   {  
      BankList myBank = new BankList();
      readAccounts(myBank);
      System.out.println("\n\nOriginal list of unsorted accounts...\n\n");
      System.out.println(myBank);
      System.out.println("\n\nSorting ascending by account number...\n\n");
      myBank.sortAscending();
      System.out.println(myBank);
      System.out.println("\n\nSorting descending by name...\n\n");
      myBank.sortDescending();
      System.out.println(myBank);
      
      /*
        search for an account number (because that's what the ascending sort sorts by)
      
       	myBank.sortAscending();
        Scanner in = new Scanner(System.in);
        String number;
        do
        {
	        System.out.print("Enter an account number to search for (-1 to quit): ");
	        number = in.nextLine();
	        if(!number.equals("-1"))
	        {
	        	int where = myBank.search(number);
	        	if (where != -1)
	       			System.out.println(number + " is " + myBank.get(where).getName());
	        	else
	       			System.out.println(number + " is not in the list");
	        }
	        
        }
       	while(!number.equals("-1"));
       */
       
   }
   
   public static void readAccounts(BankList bank) throws IOException
   {
   		Scanner input = new Scanner(new FileReader("accounts.dat"));
   		String name, accountNumber;
   		double balance;
   		while(input.hasNextLine())
   		{
   			name = input.nextLine();
   			accountNumber = input.nextLine();
   			balance = input.nextDouble();
   			input.nextLine();
   			bank.addAccount(new BankAccount(balance, accountNumber, name));
   		}
   		input.close();
   		
   }
}
