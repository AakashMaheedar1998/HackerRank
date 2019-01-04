import java.io.*;
import java.util.*;
class Program33_TheHurdleRace
{
	public static int PortionDoseNeeded(int count,int k,int hurdle[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<count;i++)
		{
			if(max<hurdle[i])
			{
				max=hurdle[i];
			}
		}
		int result=max-k;
		if(result<0)
			return 0;
		return result;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int k=scan.nextInt();
		int hurdle[]=new int[count];
		for(int i=0;i<count;i++)
		{
			hurdle[i]=scan.nextInt();
		}
		int TheHurdleRace=PortionDoseNeeded(count,k,hurdle);
		System.out.println(TheHurdleRace);
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>javac  Program33_TheHurdleRace.java

D:\GitHub\HackerRank\ProblemSolving>java Program33_TheHurdleRace
5 7
2 5 4 5 2
0

D:\GitHub\HackerRank\ProblemSolving>java Program33_TheHurdleRace
5 4
1 6 3 5 2
2
*/