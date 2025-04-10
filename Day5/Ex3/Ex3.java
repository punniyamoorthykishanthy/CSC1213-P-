import java.util.Scanner;
class Ex3
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		int num[]=new int[5];
		System.out.println("Enter the Elements: ");
		for(int i=0; i<5; i++)
		{
			num[i] = ob.nextInt();
		}
		int max = num[0];
		for(int i=1; i<5; i++)
		{
			if(num[i]>max)
				max = num[i];
			
		}
		System.out.println("maximum number is "+max);
		
		int min = num[0];
		for(int i=1; i<5; i++)
		{
			if(num[i]<min)
				min = num[i];
			
		}
		System.out.println("Minimum number is "+min);
	}
}
