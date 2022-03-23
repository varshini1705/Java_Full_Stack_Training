package java_training_programs;

public abstract class Add_and_Sub_Abstract_Class 
{
	abstract int mul(int a, int b);
	abstract int div(int a, int b);
}

class Operations extends Add_and_Sub_Abstract_Class
{
		    
// implementation of abstract method

@Override
	int mul(int a, int b)
	{
		int product = a*b;
		System.out.println("\nThe product of the two numbers is : "+product);
		return product;
	}

	int div(int a, int b)
	{
		int quotient = a/b;
		System.out.println("\nThe quotient of the two numbers is : "+quotient);
		return quotient;
		
	}
}

