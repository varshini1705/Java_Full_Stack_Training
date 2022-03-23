package java_training_programs;

import java.util.Scanner;

public class Uppercase_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str1 = in.nextLine();
		
		System.out.print("\nThe entered string is : "+str1);
		
		String str2 = str1.toUpperCase();
		
		System.out.print("\n\nThe new string is : "+str2);

	}

}
