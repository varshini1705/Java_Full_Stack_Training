package java_training_programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number to obtain the Fibonacci series : ");
		int n = in.nextInt();
		fibonacci(n);
		System.out.print("\nThe fibonacci series of " + n + " numbers is : ");
		
		for(int i=0;i<n;i++)
			
				System.out.print(" " +fibonacci(i));

	}

	private static int fibonacci(int n) {
		
		if(n == 0)
			return 0;
		
		else if(n == 1)
			return 1;
		
		else
			return fibonacci(n-1) + fibonacci(n-2);
		
	}

}
