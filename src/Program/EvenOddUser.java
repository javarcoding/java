package Program;

import java.util.Scanner;

public class EvenOddUser 
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number::");
		int a = sc.nextInt();
		  
		//int a=60;
		if(a%2==0) 
		{
			System.out.println("Number is Even");
		}
		else 
		{
			System.out.println("Number is odd");
		}
	}

}
