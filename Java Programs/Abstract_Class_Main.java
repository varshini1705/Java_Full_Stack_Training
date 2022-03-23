package java_training_programs;

import java.util.Scanner;

public class Abstract_Class_Main 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	Operations obj = new Operations();
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter the first number : ");
	int num1 = in.nextInt();
	
	System.out.print("\nEnter the second number : ");
	int num2 = in.nextInt();
	
	obj.mul(num1, num2);
	obj.div(num1, num2);
		   
	}
}
