import java.util.Scanner;
class Ex13
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = ob.nextInt();
		
		if(a%5==0 && a%11==0)
		{
			System.out.println(a+ " is divisible by 5&11");
		}
		else
		{
			System.out.println(a+ " is not divisible by 5&11");
		}
	}
}