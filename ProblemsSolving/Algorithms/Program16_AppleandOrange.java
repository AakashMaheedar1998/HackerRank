import java.io.*;
import java.util.*;
class Program16_AppleandOrange
{
	public static int[] AppleandOrange(int apple[],int orange[],int s,int t,int a,int b,int m,int n)
	{
		int result[]=new int[2];
		for(int i=0;i<2;i++)
		{
			result[i]=0;
		}
		for(int i=0;i<m;i++)
		{
			apple[i]=apple[i]+a;
			if(apple[i]>=s&&apple[i]<=t)
			{
				result[0]=result[0]+1;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			orange[i]=orange[i]+b;
			if(orange[i]>=s&&orange[i]<=t)
			{
				result[1]=result[1]+1;
			}

		}
		
		return result;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int s=scan.nextInt();
		int t=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int m=scan.nextInt();
		int n=scan.nextInt();
		int apple[]=new int[m];
		int orange[]=new int[n];
		for(int i=0;i<m;i++)
		{
			apple[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			orange[i]=scan.nextInt();
		}
		int result[]=new int[2];
		result=AppleandOrange(apple,orange,s,t,a,b,m,n);
		for(int i=0;i<2;i++)
		{
			System.out.println(result[i]);
		}
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>javac Program16_AppleandOrange.java

D:\GitHub\HackerRank\ProblemSolving>java Program16_AppleandOrange
7 11
5 15
3 2
-2 2 1
5 -6
1
1

*/