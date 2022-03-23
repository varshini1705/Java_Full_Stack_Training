package java_training_programs;

import java.util.Scanner;
public class Array_Functions {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the size of the array : ");
		int n = in.nextInt();
		
		int a [] = new int[n];
		
		System.out.print("\nEnter the array elements : ");
		
		for(int i=0;i<n;i++)
				a[i] = in.nextInt();
		
		System.out.print("\nThe array elements are : ");
		
		for(int i=0;i<n;i++)
				System.out.print(a[i] + " ");
		
		System.out.println();
		
		int sum = 0;
		System.out.print("\nThe sum of first 50 natural numbers is : "); 
		
		for(int i=1;i<=50;i++)
		{
			sum +=i;
		}
		
		System.out.print(sum);
		
		sum = 0;
		System.out.println();
		
		System.out.print("\nThe sum of first 50 whole numbers is : "); 
		
		for(int i=0;i<50;i++)
		{
			sum +=i;
		}
		
		System.out.print(sum);

	}

}
