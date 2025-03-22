import java.util.Scanner;
class Day2Ex9
{
	public static void main(String arg[])
	{
		Scanner ob = new Scanner (System.in);
		
		System.out.println("Enter the number : ");
		double num = ob.nextDouble();
		
		if(num%2 == 0)
		{
			System.out.println("This is even number ");
		}
		else
		{
			System.out.println("This is odd number");
		}
	}
}	
			