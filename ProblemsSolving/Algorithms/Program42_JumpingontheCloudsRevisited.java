import java.io.*;
import java.util.*;
class Program42_JumpingontheCloudsRevisited
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	int cloudcount=scan.nextInt();
	int jump=scan.nextInt();
	int cloudarr[]=new int[cloudcount];
	for(int i=0;i<cloudcount;i++)
	{
		cloudarr[i]=scan.nextInt();
	}
	int energy=100;
	for(int i=0;i<cloudcount;i=i+jump)
	{
		if(cloudarr[i]==0)
		{
			energy=energy-1;
		}
		else
		{
			energy=energy-3;
		}
		
	}
	System.out.println(energy);
	}
	
	
}
/*
D:\GitHub\HackerRank\ProblemSolving>java Program42_JumpingontheCloudsRevisited
10 3
1 1 1 0 1 1 0 0 0 0
94
*/