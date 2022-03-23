package java_training_programs;

import java.util.Scanner;

class Inheritence_Methods
{

	public int area(int l, int b)
	{
		System.out.print("\nThe area of the rectangle is : "+(l * b)+ " square units");
		return (l * b);			
	}
			
	public int perimeter(int l, int b)
	{
		System.out.print("\n\nThe perimeter of the rectangle is : "+(2 * (l + b))+ " units");
		return (2 * (l + b));
	}
}
	
class Inheritence_Main extends Inheritence_Methods
{		
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
				
		System.out.print("Enter the length : ");
		int length = in.nextInt();
				
		System.out.print("\nEnter the breadth : ");
		int breadth = in.nextInt();	
		
		Inheritence_Main obj = new Inheritence_Main();
		
		obj.area(length,breadth);
		obj.perimeter(length,breadth);
	}
}


