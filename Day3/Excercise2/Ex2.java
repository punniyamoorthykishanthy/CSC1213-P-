import java.util.Scanner;
class Ex2
{
	public static void main(String srgs[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter the First number : ");
		int a = ob.nextInt();
		
		System.out.print("Enter the second number : ");
		int b = ob.nextInt();
		
		System.out.print("Enter the third number : ");
		int c = ob.nextInt();
		
		if(a>b && a>c)
		{
			System.out.print(a+" is maximum number");
		}
		else if(b>a && b>c)
		{
			System.out.print(b+ " is maximum number");
		}
		else
		{
			System.out.print(c+ " is maximum number");
		}
	}
}
		
		
		