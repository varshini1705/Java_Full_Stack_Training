package java_training_programs;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Hello Varshini\n");
		
		System.out.print("Enter the value of a : ");
		int a = in.nextInt();
		
		System.out.print("\nEnter the value of b : ");
		int b = in.nextInt();
		
		System.out.println("\nThe sum of a and b is : " + (a+b));
		System.out.println("\nThe difference of a and b is : " + (a-b));
		System.out.println("\nThe product of a and b is : " + (a*b));
		System.out.println("\nThe quotient of a and b is : " + (a/b));
		
	}

}
