import java.io.*;
import java.util.*;
class Program41_SequenceEquation
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int num=0;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=1;i<=count;i++)
		{
			
			num=scan.nextInt();
			hm.put(num,i);
			
		}
		for(int i=1;i<=count;i++)
		{
				int x=i;
				int loc=hm.get(x);
				int index=hm.get(loc);
				System.out.println(index);
		}
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java Program41_SequenceEquation
3
2 3 1
2
3
1
*/