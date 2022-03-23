package java_training_programs;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number to obtain its multiplication table : ");
		int n = in.nextInt();
		
		System.out.println("\nThe multiplication table for the given number is : ");
		
		for(int i=1 ; i<= 10 ;i++)
			System.out.println(n+ " X " +i+ " = " +(n*i));
		
	}

}
