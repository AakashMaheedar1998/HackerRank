import java.io.*;
import java.util.*;
class Program38_ViralAdvertising
{
	public static int ViralAdvertising(int day)
	{
		int sharedx=5;
		int liked=0;
		int cummulative=0;
		for(int i=1;&&i<=day;i++)
		{
			liked=(int)Math.ceil(sharedx/2);
			cummulative+=liked;
			sharedx=liked*3;
		}
		return cummulative;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int day=scan.nextInt();
		int cummulative=ViralAdvertising(day);
		System.out.println(cummulative);
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java Program38_ViralAdvertising
5
24

D:\GitHub\HackerRank\ProblemSolving>java Program38_ViralAdvertising
1
2

D:\GitHub\HackerRank\ProblemSolving>java Program38_ViralAdvertising
2
5

D:\GitHub\HackerRank\ProblemSolving>java Program38_ViralAdvertising
4
15

*/
