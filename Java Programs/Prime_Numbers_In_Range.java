package java_training_programs;

import java.util.Scanner;

public class Prime_Numbers_In_Range {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the maximum number in the range : ");
		int end = in.nextInt();
		
		System.out.print("\nThe prime numbers in the range from  1 to "+end+ " are : ");
		int count = 0;
		for(int i = 2 ;  i <= end; i++)
		{
			boolean flag = true;
			
			
			for(int j = 2; j <= i / 2; j++)
			{
				
				if ( i % j == 0)
				{
					flag = false;
					
					break;
					
				}
			}
				
			if(flag == true)
			{
				count += 1;
				System.out.print(i+ " ");
			}	
			
		}
		System.out.println();
		
		System.out.println("\nThere are a total of " +count+ " numbers which are prime in the range 1 to " +end);

	}
}
