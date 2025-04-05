import java.util.Scanner;
class Ex2
{
	public static void main(String args[])
	{
		
		Scanner ob = new Scanner(System.in);
		int sum = 0;
		char control = 'b';
		do
		{
		System.out.println("Enter the number : ");
		int a = ob.nextInt();
		sum = sum+a;
		System.out.println("Do you want to continue(Y/N) : ");
		control = ob.next().charAt(0);
		}
		while(control=='Y');
		System.out.println("Summation "+sum);
	}
}
		
		