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