package Excercisepgms;

import java.util.Scanner;

public class ExeStarprint
{
	int i,n;
	public void starpattern(int n)
	{

	System.out.println("-----------Star pattern-----------");	
		for(i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("*");
				
			}
			System.out.println(""
					+ "");
		}
	}
	public void starreverse(int n)
	{
		
		System.out.println("--------Reverse of Star Pattern------");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println(""+ ""
			);
		}
	}
	

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		ExeStarprint star=new ExeStarprint();
		star.starpattern(n);
		star.starreverse(n);
		

	}

}
