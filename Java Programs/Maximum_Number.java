package java_training_programs;

import java.util.Scanner;

public class Maximum_Number {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int num1 = in.nextInt();
		
		System.out.print("\nEnter the first number : ");
        int num2 = in.nextInt();
       
        System.out.print("\nThe maximum of the two numbers is : " +Math.max(num1, num2));
	}

}
