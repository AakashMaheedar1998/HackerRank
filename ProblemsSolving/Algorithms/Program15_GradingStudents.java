import java.io.*;
import java.util.*;
class Program15_GradingStudents
{
	public static int[] GradeReturn(int arr[],int count)
	{
		int find=0,current=0,nxtval=0,diff=0;
		for(int i=0;i<count;i++)
		{
			
			current=arr[i];
			if(current>=38)
			{	
			find=current%5;
			find=5-find;
			nxtval=current+find;
			
			diff=nxtval-current;
			if(diff<3)
				{
				current=nxtval;
				arr[i]=current;	
				}
			else
				{
				arr[i]=current;
				}
			}
			else
				arr[i]=current;
		}
		return arr;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int arr[]=new int[count];
		for(int i=0;i<count;i++)
		{
			arr[i]=scan.nextInt();
		}
		arr=GradeReturn(arr,count);
		for(int i=0;i<count;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>javac Program15_GradingStudents.java

D:\GitHub\HackerRank\ProblemSolving>java Program15_GradingStudents
4
73 67 38 33
75
67
40
33
*/