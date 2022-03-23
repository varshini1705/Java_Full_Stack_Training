package java_training_programs;

import java.util.ArrayList;

public class Length_of_ArrayList {

	public static void main(String[] args) 
	
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Apple");
		al.add("123");
		al.add("92.96");
		al.add("true");
		
		System.out.println("\nThe items in the Array List are : "+al);
		
		System.out.print("\nThe length of the Array List is : "+al.size());

	}

}
