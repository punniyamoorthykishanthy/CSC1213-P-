class Day2Ex2
{
	public static void main(String arg[])
	{
		String name,address,DOB,sex;
		int age;
		name = arg[0];
		address = arg[1];
		DOB = arg[2];
		sex = arg[3];
		age = Integer.parseInt(arg[4]);
		
		System.out.println("Name : "+name + "\n" +"Address : "+address +"\n" +"DOB : "+DOB +"\n" +"Sex : " +sex + "\n" +"Age : " +age );
		
		int a = 10;
		int b = age+a;
		System.out.println("Age : " +b);
		
	}
}