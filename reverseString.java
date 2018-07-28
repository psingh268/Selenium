import java.util.Scanner;

 class reverseString {
	/*public  satic String reverseString(String str)
	{
		String rvrs="";
		int lenght=str.length();
		for(int i=lenght-1 ; i>=0;i--)
		{
			rvrs=rvrs+str.charAt(i);
		}
		return rvrs;
		
	}*/
	/*public  static void reverseString(String str)
	{
		String rvrs="";
		int lenght=str.length();
		for(int i=lenght-1 ; i>=0;i--)
		{
			rvrs=rvrs+str.charAt(i);
		}
		System.out.println("your reverse string is:: "+rvrs);
		
	}*/
	public void reverseString(String str)
	{
		String rvrs="";
		int lenght=str.length();
		for(int i=lenght-1 ; i>=0;i--)
		{
			rvrs=rvrs+str.charAt(i);
		}
		System.out.println("your reverse string is:: "+rvrs);
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter string for reverse");
		String userInput= sc.nextLine();
		System.out.println("you given string = " +userInput);
		reverseString obj=new reverseString();
		obj.reverseString(userInput);
		//System.out.println("your reverse string is:: "+obj.reverseString(userInput););
		//System.out.println("your reverse string is:: "+reverseString(userInput););   >>> when we have a returntype
		
		}

}
