package java_training_programs;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number to check if it is even or odd : ");
		int n = in.nextInt();
		if( n % 2 == 0)
			System.out.println("\nThe number " +n+ " is even");

		else
			System.out.println("\nThe number " +n+ " is odd");
	}

}
