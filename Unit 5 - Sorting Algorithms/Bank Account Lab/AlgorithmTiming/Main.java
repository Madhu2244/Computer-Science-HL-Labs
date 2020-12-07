/**
 *  TimingTester
 *
 *  Test timing of a variety of algorithms as array size increases
 */

import java.util.Scanner;

public class Main // TimingTester
{
	/** for scanning from keyboard */
	private static Scanner scan;
	
	/** exit menu */
	private static final int QUIT = 5;

	public static void main(String[] args) throws InterruptedException
	{
		scan = new Scanner(System.in);
		while (true)
		{
			int choice = getMenuChoice();
			if (choice == QUIT)
				break;
			
			long[][] table = processMenuChoice(choice);	
	
			System.out.println("  Size     Time");
			for (int k = 0; k < table.length; k++)
				System.out.printf("%8d  %10d\n", table[k][0], table[k][1]);
			System.out.println("\n");
		}
	}
	
	/** Get choice of function to run
	 *   @return user's choice of function or quitting
	 */
	private static int getMenuChoice()
	{
		boolean invalidChoice = true;
		int choice = 0;
		while (invalidChoice)
		{
			System.out.println("1 - traverse array");
			System.out.println("2 - sort array");
			System.out.println("3 - mystery1");
			System.out.println("4 - mystery2");
			System.out.println("5 - quit");
			System.out.print("Choice? ");
			choice = scan.nextInt();
			System.out.println();

			invalidChoice = choice < 1 || choice > QUIT;
			if (invalidChoice)
				System.out.println("Invalid choice: " + choice
					+ ". Try again.\n");
		}
		return choice;
	}

	/** Run selected function as many times as needed
	 *   with the array sizes chosen by the user
	 *   @param choice the function to be run
	 *   @return 2-D table with array size and time of each run
	 */
	private static long[][] processMenuChoice(int choice) throws InterruptedException
	{
		StopWatch timer = new StopWatch();

		System.out.print("Number of runs? ");
		int rounds = scan.nextInt();
		
		long[][] table = new long[rounds][2];
		for (int k = 0; k < rounds; k++)
		{
			System.out.print("Size of array? ");
			int size = scan.nextInt();
			int[] arr = random1DArray(size);

			timer.reset();
			timer.start();

			if (choice == 1)
				traverseArray(arr);
			else if (choice == 2)
				selectionSortArray(arr);
			else if (choice == 3)
				mystery1(arr);
			else
				mystery2(arr);
			
			timer.stop();
			long time = timer.getElapsedTime();

			table[k][0] = size;
			table[k][1] = time;
		}
		return table;
	}

	/** Generate array of length len with random integers
	 *   in range [100, 999]
	 *   @param len the size of the array
	 *   @return the randomly filled array of length len
	 */
	private static int[] random1DArray(int len)
	{
		int[] nums = new int[len];
		for (int k = 0; k < nums.length; k++)
			nums[k] = (int) (Math.random() * 900) + 100;
		return nums;
	}
	
	private static void traverseArray(int[] arr) throws InterruptedException
	{
		int sum = 0;
		for (int num : arr)
		{
			sum += num;
			Thread.sleep(1);
		}
	}
	
	private static void selectionSortArray(int[] number) 
	{
		int minIndex, length, temp, i;
		length = number.length;
		for (int startIndex = 0; startIndex <= length-2; startIndex++) 
		{
			minIndex = startIndex;
			for (i = startIndex + 1; i <= length - 1; i++) 
			{
				if (number[i] < number[minIndex]) 
					minIndex = i;
			}
			temp = number[startIndex];
			number[startIndex] = number[minIndex];
			number[minIndex] = temp;
		}
	}

	private static void mystery1(int[] number) throws InterruptedException
	{
		int sum = 0;
		for (int j = 1; j <= number.length; j = j * 2) 
		{
			sum += number[j - 1];
			Thread.sleep(2);
		}
 	}

	private static void mystery2(int[] number) 
	{
		int sum = 0;
		for (int k = 0; k < number.length; k++) 
			for (int j = 1; j <= number.length; j = j * 2)
				sum += number[j - 1];
	}
}
