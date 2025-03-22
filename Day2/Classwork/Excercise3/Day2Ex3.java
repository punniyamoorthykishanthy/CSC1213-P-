import java.util.Scanner;
class Day2Ex3
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter your first name : ");
		String fname = sc.nextLine();
		
		System.out.print("Enter your last name : ");
		String lname = sc.next();
		
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		
		System.out.print("Enter your registration number : ");
		String Reg = sc.next();
		
		System.out.print("Sex (M/F) : ");
		char Sex = sc.next().charAt(0);
		
		System.out.print("Enter your mobile phone number : ");
		long mob = sc.nextLong();
		
		System.out.print("Enter your GPA : ");
		double GPA = sc.nextDouble();
		
		System.out.println();
		System.out.println("Full Name : " +fname +" " +lname + "\n" + "Registration Number : " +Reg + "\n" +"Sex : " +Sex +"\n" +"Mobile Number : " +mob +"\n" + "GPA : " +GPA );
		
		
	}
}
		