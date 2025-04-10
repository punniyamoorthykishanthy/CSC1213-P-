import java.util.Scanner;
class Ex2
{
	public static void main(String args[])
{
	Scanner ob = new Scanner(System.in);
	int Arr[]=new int[10];
    System.out.println("Enter the elements: ");
	for(int i=0; i<10; i++)
	{
		
		Arr[i]=ob.nextInt();
		
	}
	String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	for(String day:days)
	{
		System.out.println(day);
	}
	
}
}
	