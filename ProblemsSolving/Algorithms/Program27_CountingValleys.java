import java.io.*;
import java.util.*;
class Program27_CountingValleys
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		boolean BseaLvl=false;
		int level=0;
		int valley=0;
		int n=scan.nextInt();
		String str=scan.next();
		for(int i=0;i<n;i++)
		{
			char c=str.charAt(i);
			if(c=='U')
			{
				level++;
			}
			else
			{
				level--;
			}
			if(!BseaLvl&&level<0)
			{
				valley++;
				BseaLvl=true;
			}
			if(level>=0)
			{
				BseaLvl=false;
			}
			
		}
		System.out.println(valley);
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java Program27_CountingValleys
8
UDDDUDUU
1

D:\GitHub\HackerRank\ProblemSolving>java Program27_CountingValleys
8
DDUUUUDD
1

D:\GitHub\HackerRank\ProblemSolving>java Program27_CountingValleys
9
DDUUUUDDD
2
*/