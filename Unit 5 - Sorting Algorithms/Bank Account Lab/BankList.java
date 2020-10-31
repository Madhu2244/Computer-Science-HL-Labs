import java.util.ArrayList;

public class BankList
{
	private ArrayList<BankAccount> accounts;
	
	/**
	 * Constructs a Bank object with no accounts

	 */
	public BankList()
	{
		accounts = new ArrayList<BankAccount>(); // all null
	}
	
	/**
	 * Adds a new BankAccount to accounts.  
	 * @param b the BankAccount to add
	 */
	public void addAccount(BankAccount b)
	{
		accounts.add(b);
	}

	public String toString()
	{
		String output = "";
		for(BankAccount b: accounts)
			output += b + "\n";
		return output;
	}
	
	public BankAccount get(int index)
	{
		return accounts.get(index);
	}
	
	/**
	 * Uses the BankAccount compareTo method to sort ascending by account number
	 * Use ANY of the 3 quadratic sorts
	 */
	public void sortAscending() 
	{
		
	}
	
	/**
	 * Sorts the account descending by name
	 * USE A DIFFERENT quadratic SORT than you used in sortAscending
	 * CANNOT use BankAccount compareTo
	 */
	public void sortDescending()
	{
		
	}
	

	/**
	 * uses a binary search to find the index of the account with the 
	 * specified account number
	 * @param number the account number to search for
	 * @return the index of the account or -1 if it does not exist
	 */
	public int search(String number)
	{
		return -1;
	}
}
