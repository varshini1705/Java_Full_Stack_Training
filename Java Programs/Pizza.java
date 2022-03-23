package java_training_programs;

import java.util.Scanner;


public class Pizza {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount : ");
		int amt = in.nextInt();
		
		if(amt > 200)
			System.out.println("\nPizza can be bought with Rs. "+amt);
		
		else
			System.out.println("\nPizza cannot be bought with Rs. "+amt);

	}

}
