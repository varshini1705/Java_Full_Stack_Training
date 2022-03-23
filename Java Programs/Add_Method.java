package java_training_programs;


import java.util.Scanner;

public class Add_Method {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num1 = in.nextInt();
		
		System.out.print("\nEnter the second number : ");
		int num2 = in.nextInt();
		
		System.out.print("\nThe sum of the two numbers is : "+sum(num1,num2));

	}

	public static int sum(int num1, int num2) {
		
		int sum = num1 + num2;
		return sum;
	}

}
