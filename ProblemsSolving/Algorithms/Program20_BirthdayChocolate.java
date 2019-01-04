import java.io.*;
import java.util.*;

class Program20_BirthdayChocolate
{
	public static int BirthdayChocolate(int arr[],int count,int date,int month)
	{
		int sum=0,piece=0;
		try
		{
		
		for(int i=0;i<count;i++)
		{
			int j=0;
			while(j<month&&(i+j)<count)
			{
				sum+=arr[i+j];
				j++;
			}
			
			if(sum==date)
			{
				piece++;
			}
			sum=0;
		}
		}
		catch(Exception e)
		{
			System.out.println(" ");
		}
		return piece;
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int choco[]=new int[count];
		for(int i=0;i<count;i++)
		{
			choco[i]=scan.nextInt();
		}
		int date=scan.nextInt();
		int month=scan.nextInt();
		int piece=BirthdayChocolate(choco,count,date,month);
		System.out.println(piece);
	}
}
/*
D:\GitHub\HackerRank\ProblemSolving>java Program20_BirthdayChocolate
5
2 2 1 3 2
4
2
2

D:\GitHub\HackerRank\ProblemSolving>javac Program20_BirthdayChocolate.java

D:\GitHub\HackerRank\ProblemSolving>java Program20_BirthdayChocolate
6
1 1 1 1 1 1
3 2
0

D:\GitHub\HackerRank\ProblemSolving>java Program20_BirthdayChocolate
1
4
4 1
1
*/