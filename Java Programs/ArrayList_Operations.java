package java_training_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Operations {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> al = new ArrayList<String>();
		
		int choice;
		do
		{
			System.out.print("\n1. Add elements to the array list\n2. Remove an element from the array list\n3. Clear all elements from the array list\n4. Display the array list\n5. Exit\n\nEnter your choice : "); 
			choice = in.nextInt();
			
			switch(choice)
			{
				case 1 : System.out.print("Enter the element to be added : ");
						 String str = in.nextLine();
						 al.add(str);
						 System.out.println("Element successfully added");
						 break;
						 
				case 2 : System.out.print("\nEnter the element to be removed from the array list : ");
						 String str2 = in.nextLine();
						 al.remove(str2);
						 System.out.println("Element successfully removed");
						 break;
						 
			    case 3 : System.out.print("\nWould you like to remove all elements from the array list? (y/n)? : ");
			    		 char c = in.next().charAt(0);
			    		 
			    		 if(c == 'y')
			    		 {
			    			 al.clear();
			    			 System.out.println("Removed all elements from the array list");
			    		 }
			    		 
			    		 else if(c == 'n')
			    		 {
			    			 System.out.println("\nOperation cancelled");
			    			 break;
			    		 }
			    		 
			    		 else	
			    		 {
			    			 System.out.println("\nEnter a valid option");
			    		 	 continue;
			    		 }
			    		 
			    case 4 : System.out.print("\nThe elements in the array list are : "+al);
			    
			    case 5 : return;
			    
			    default : System.out.print("\nEnter a valis choice : ");
			    		 
			}
			
		}
		
		while(choice != 5);

	}

}
