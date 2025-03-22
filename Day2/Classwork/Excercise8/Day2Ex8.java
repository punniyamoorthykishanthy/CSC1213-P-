import java.util.Scanner;
class Day2Ex8
{
	public static void main(String args[])
	{
		Scanner pk = new Scanner(System.in);
		
		System.out.println("Input the side length value : ");
		double L = pk.nextDouble();
		
		System.out.printf("Square : %.2f\n",L*L);
		System.out.printf("Cube : %.2f\n",L*L*L);
		System.out.printf("Forth power : %.2f\n",Math.pow(L,4));
	}
}
		