import java.util.Scanner;
class Ex1
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = ob.nextInt();
		
		int sum =0;
		int i = 1;
		while(i<=a)
		{
			sum = sum+i;
			i++;
			
		}
		System.out.println("Summetion if numbers from 0 to "+a +" = "+sum);
	}
}
		