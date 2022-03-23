package java_training_programs;

import java.util.Scanner;

public class Add_and_Sub_Interface_Main implements Add_and_Sub {


	public int add(int a, int b)
	{
		int sum = a + b;
		System.out.println("\nThe sum of the two numbers is : " +sum);
		return sum;
	}
	
	@Override
	public int sub(int a, int b) 
	{
		System.out.println("\nThe difference of the two numbers is : "+(a-b));
		return(a-b);
	}  

  
	@SuppressWarnings("resource")
	public static void main(String args[])
	{  
		Add_and_Sub_Interface_Main obj = new Add_and_Sub_Interface_Main();  
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num1 = in.nextInt();
		
		System.out.print("\nEnter the second number : ");
		int num2 = in.nextInt();
		obj.add(num1, num2);  
		obj.sub(num1, num2);
	}
}
