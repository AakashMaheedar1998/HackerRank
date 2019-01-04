import java.io.*;
import java.util.*;
class Program25_SockMerchant
{
	public static int SockMerchant(int socks[],int count)
	{
		int pair=0;
		Arrays.sort(socks);
		for(int i=0;i<count;i++)
		{
			if((i+1)<count)
			if(socks[i]==socks[i+1])
			{
				i=i+1;
				pair=pair+1;
			}
		}
		
		return pair;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int socks[]=new int[count];
		for(int i=0;i<count;i++)
			socks[i]=scan.nextInt();
		int pairs=SockMerchant(socks,count);
		System.out.println(pairs);
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java Program25_SockMerchant
7
1 2 1 2 1 3 2
2

D:\GitHub\HackerRank\ProblemSolving>java Program25_SockMerchant
9
10 20 20 10 10 30 50 10 20
3
*/