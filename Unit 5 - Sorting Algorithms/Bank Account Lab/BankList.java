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
		for (int i = 1; i <= accounts.size(); i++)
		{
		  for (int k = 0; k < accounts.size()-i; k++)
		  {
		    if (accounts.get(k).compareTo(accounts.get(k+1)) > 0)
		    {
		      BankAccount temp = accounts.get(k);
		      accounts.set(k,accounts.get(k+1));
		      accounts.set(k+1, temp);
		    }
		  }
		}
	}
	
	/**
	 * Sorts the account descending by name
	 * USE A DIFFERENT quadratic SORT than you used in sortAscending
	 * CANNOT use BankAccount compareTo
	 */
	public void sortDescending()
	{
		for (int i = 0; i < accounts.size() - 1; i++)
		{
		  int maxPosition = i;
		  for (int k = i + 1; k < accounts.size(); k++)
		  {
		    //stem.out.println(accounts.get(i).getName() + "," + accounts.get(maxPosition).getName());
		    
		    if (accounts.get(k).getName().compareTo(accounts.get(maxPosition).getName()) > 0)
		    {
		      maxPosition = k;
		    }
		  }
		  
		  BankAccount temp = accounts.get(maxPosition);
		  accounts.set(maxPosition, accounts.get(i));
		  accounts.set(i, temp);

		}
	}
	

	/**
	 * uses a binary search to find the index of the account with the 
	 * specified account number
	 * @param number the account number to search for
	 * @return the index of the account or -1 if it does not exist
	 */
	public int search(String number)
	{
	  int left = 0;
	  int right = accounts.size() - 1;
	  while (left <= right)
	  {
	    int middle = (left + right) / 2;
	    if (Integer.parseInt(number) < Integer.parseInt(accounts.get(middle).getNumber()))
	    {
	      right = middle - 1;
	    }
	    else if (Integer.parseInt(number) > Integer.parseInt(accounts.get(middle).getNumber()))
	    {
	      left = middle + 1;
	    }
	    else
	    {
	      return middle;
	    }
	  }
	  return -1;
	}
}
