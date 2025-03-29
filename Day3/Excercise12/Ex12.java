import java.util.Scanner;
class Ex12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd number : ");
		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+ " is maximum number");
		}
		else
		{
			System.out.println(b+ " is maximum number");
		}
	}
}
