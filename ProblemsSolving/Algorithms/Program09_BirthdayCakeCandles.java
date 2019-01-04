import java.io.*;
import java.util.*;
class Problem_09BirthdayCakeCandles
{
	public static int CandleThatWillcanBeBlown(int candle[],int count)
	{
		Arrays.sort(candle);
	/*	for(int j=0;j<count;j++)
			System.out.print(candle[j]+" ");
		*/	
		int i=1,candlecount=0;
		//System.out.println("\n"+candle[count-1]);
		int highest=candle[count-1];
		
		while(i<=count&&highest==candle[count-i])
		{
		candlecount++;
		i++;
		}
		return candlecount;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int candle[]=new int[count];
		for(int i=0;i<count;i++)
		{
			candle[i]=scan.nextInt();
		}
	int result=CandleThatWillcanBeBlown(candle,count);
	System.out.println(result);
	}

}
/*OUTPUT
D:\GitHub\HackerRank\ProblemSolving>java  Problem_09BirthdayCakeCandles
5
1 2 4 4 4
3

D:\GitHub\HackerRank\ProblemSolving>java  Problem_09BirthdayCakeCandles
4
1 2 3 4
1
*/