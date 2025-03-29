import java.util.Scanner;
class Ex6
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the value for counter1 : ");
		int c1 = ob.nextInt();
		
		System.out.print("Enter the value for counter2 : ");
		int c2 = ob.nextInt();
		
		for(int i=0 ; i<c1 ; i++)
		{
			System.out.println("Value for i : " +i);
			
			for(int j=0 ; j<c2 ; j++)
			{
				System.out.println("Value for j : " +j);
			}
			System.out.println();
		}
	}
}
		