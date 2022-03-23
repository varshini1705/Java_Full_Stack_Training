package java_training_programs;

import java.util.Scanner;

public class Largest_of_3_Numbers {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int a = in.nextInt();
		
		System.out.print("\nEnter the second number : ");
		int b = in.nextInt();
		
		System.out.print("\nEter the third number : ");
		int c = in.nextInt();
		
		if(a > b && a > c)
			System.out.println("\n" +a+ " is the largest among the 3 numbers "+a+ ", "+b+ " and " +c);
		
		else if(b > a && b > c)
			System.out.println("\n" +b+ " is the largest among the 3 numbers "+a+ ", "+b+ " and " +c);
		
		else
			System.out.println("\n" +c+ " is the largest among the 3 numbers "+a+ ", "+b+ " and " +c);

	}

}
