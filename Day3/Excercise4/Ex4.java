import java.util.Scanner;
class Ex4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the latter : ");
		char let = sc.next().charAt(0);
		
		switch(let)
		{
			case 'a': case 'e': case 'i': case'o': case'u':
			case 'A': case 'E': case 'I': case'O': case'U':
			System.out.println(let+ " is vowel letter");
			break;
			
			default:
			System.out.println("The letter is not vowel");
		}
	}
}
		