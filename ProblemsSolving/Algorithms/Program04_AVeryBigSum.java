import java.io.*;
import java.util.*;
class Progarm04_AVeryBigSum
{
	public static long aVeryBigSum(long arr1[])
	{
		long result=0;
		for(int i=0;i<arr1.length;i++)
		{
			result+=arr1[i];
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		long arr1[]=new long[count];
		for(int i=0;i<arr1.length;i++)
			arr1[i]=scan.nextInt();
		long sum=aVeryBigSum(arr1);
		System.out.println(sum);
	}
}
/*
Output:

D:\GitHub\HackerRank\ProblemSolving>java AVeryBigSum

5
500001 500002 500003 500004 500005
2500015

*/