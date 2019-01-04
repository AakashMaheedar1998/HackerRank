import java.io.*;
import java.util.*;
class Program19_BreakingtheRecords
{
	public static void  BreakTheRecord(int score[],int game)
	{
		int maximum,minimum,max,min;
		maximum=minimum=score[0];
		min=max=0;
		for(int i=1;i<game;i++)
		{
			if(minimum>score[i])
			{
				minimum=score[i];
				min++;
			}
			if(maximum<score[i])
			{
				maximum=score[i];
				max++;
			}
			
		}
		System.out.println(max+" "+min);
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int game=scan.nextInt();
		int score[]=new int[game];
		for(int i=0;i<game;i++)
		{
			score[i]=scan.nextInt();
		}
		BreakTheRecord(score,game);
	}
	
}
/*OUTPUT
D:\GitHub\HackerRank\ProblemSolving>javac Program19_BreakingtheRecords.java

D:\GitHub\HackerRank\ProblemSolving>java Program19_BreakingtheRecords
4
12 24 10 24
1 1

D:\GitHub\HackerRank\ProblemSolving>java Program19_BreakingtheRecords
9
10 5 20 20 4 5 2 25 1
2 4

D:\GitHub\HackerRank\ProblemSolving>java Program19_BreakingtheRecords
10
3 4 21 36 10 28 35 5 24 42
4 0
*/