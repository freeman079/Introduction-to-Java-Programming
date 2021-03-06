package Chapter_07_Single_Dimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Identical arrays
 * The arrays list1 and list2 are identical if they have the same contents. 
 * Write a method that returns true if list1 and list2 are identical, using the following header: 
 * public static boolean equals(int[] list1, int[] list2)
 * Write a test program that prompts the user to enter two lists of integers and displays whether the two are identical. 
 * Here are the sample runs. Note that the first number in the input indicates the number of the elements in the list. 
 * This number is not part of the list.
 * 
 * 09/26/2016
 * @author kevgu
 *
 */

public class Programming_Exercise_27 
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter list 1: ");
		int[] arrayList1 = new int[input.nextInt()];
		fillList(arrayList1);
		
		System.out.print("Enter list 2: ");
		int[] arrayList2 = new int[input.nextInt()];
		fillList(arrayList2);
		
		if (equals(arrayList1, arrayList2))
			System.out.print("Both list are identical!");
		else
			System.out.print("Both list are not identical!");
		
		input.close();
	}
	
	/**
	 * Fill list up with integers
	 * 
	 * @param arrayList
	 */
	public static void fillList(int[] arrayList)
	{
		for (int i = 0; i < arrayList.length; i++)
			arrayList[i] = input.nextInt();
	}
	
	/**
	 * method that returns true if list1 and list2 are strictly identical
	 * 
	 * @param list1
	 * @param list2
	 * @return
	 */
	public static boolean equals(int[] list1, int[] list2) 
	{
		Arrays.sort(list1);
		Arrays.sort(list2);
		for (int i = 0; i < list1.length; i++)
			if (list1[i] != list2[i])
				return false;
		return true;
	}
}
