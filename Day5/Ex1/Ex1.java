import java.util.Scanner;
class Ex1
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		int integer[] = new int[5];
		int sum = 0;
		for(int i=0 ; i<5 ; i++)
		{
			System.out.print("Enter the number : ");
			integer[i] = ob.nextInt();
			sum = sum+integer[i];
		}
		System.out.println("Sum of this numbers: "+sum);
		
		
	}
}
		
		