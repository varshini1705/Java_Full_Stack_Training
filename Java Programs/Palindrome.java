package java_training_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string/number : ");
		String str = in.nextLine();
		
		String rev = "";
		
		for(int i = str.length() - 1; i >=0; i--)
		{
			rev += str.charAt(i);
		}
		
		if(str.equals(rev))
			System.out.println("\nThe entered string/number " +str+ " is a palindrome");
		
		else
			System.out.println("\nThe entered string/number " +str+ " is not a palindrome");

	}

}
