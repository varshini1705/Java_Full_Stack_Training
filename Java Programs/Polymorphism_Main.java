package java_training_programs;

import java.util.Scanner;

class Polymorphism_Methods 
{	
	public int add(int a, int b)
	{
		System.out.print("\nThe sum of the two numbers is : "+(a+b));
		return (a+b);
		
	}
	
	public int add(int a, int b, int c)
	{
		System.out.print("\n\nThe sum of the three numbers is : "+(a+b+c));
		return (a+b+c);
	}
}

class Polymorphism_Main extends Polymorphism_Methods
{
	public static void main(String[] args)
	{
		Polymorphism_Main obj = new Polymorphism_Main();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num1 = in.nextInt();
		
		System.out.print("\nEnter the second number : ");
		int num2 = in.nextInt();	
		
		System.out.print("\nEnter the third number : ");
		int num3 = in.nextInt();
		
		obj.add(num1, num2);
		obj.add(num1, num2, num3);
	}
}