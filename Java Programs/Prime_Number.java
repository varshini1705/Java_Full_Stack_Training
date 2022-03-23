package java_training_programs;

import java.util.Scanner;

public class Prime_Number 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number to check if it is prime or not : ");
		int n = in.nextInt();
		
		boolean flag = false;
		
		for(int i = 2 ; i <= n /2 ; i++)
		{
			if(n % i == 0)
			flag = true;
		}
	
		if(!flag)
			System.out.println("\nThe number " +n+ " is a prime number");
		
		else
			System.out.println("\nThe number " +n+ " is not a prime number");
	}

}
