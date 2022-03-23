package java_training_programs;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array : ");
		int n = in.nextInt();
		int a [] = new int[n];
		System.out.print("\nEnter the array elements : ");
		for (int i = 0; i < n; i++) 
		{
			a[i] = in.nextInt();		
		}
		
		int temp = 0;
		
		for(int i=0;i<n;i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(a[j]<a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
				/*else
				{
					a[j] =temp;
					a[j] = a[i];
					a[i] = temp;
				}*/
			}
		}
		
		System.out.print("\nThe sorted array is ");
		
		for(int i=0;i<n;i++)
			System.out.print(" " +a[i]);
		
		System.out.println();
			
		
		System.out.print("\nEnter the element to be searched : ");
		int key = in.nextInt();
		
		int result = binary_search(key, n, a);
		
		if(result == -1)
			System.out.println("\nElement not found");
		
		else
			System.out.println("\nElement found at position " + (result+1));
		
	}

	private static int binary_search(int key, int n, int[] a) 
	{
		int low = 0, high = n-1, mid;
		
		while(low <= high)
		{
			
				mid = (low + high) /2;
				
				if(a[mid] == key)
					
					return mid;
				
				else if(a[mid] < key)
					
					low = mid + 1;
				
				else
					high = mid - 1;
			
			
		}
		return -1;

	}
}
