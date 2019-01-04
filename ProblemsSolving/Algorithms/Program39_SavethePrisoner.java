import java.io.*;
import java.util.*;
class Program39_SavethePrisoner
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	int sets=scan.nextInt();
	int result[]=new int[sets];
	for(int i=0;i<sets;i++)
		{
				int countP=scan.nextInt();
				int noofchocolate=scan.nextInt();
				int start=scan.nextInt();
				int poisonedprisoner=(start+noofchocolate-1)%countP;
				if(poisonedprisoner==0)
				{
					poisonedprisoner=countP;
				}
				result[i]=(poisonedprisoner);
		}	
	for(int i=0;i<sets;i++)
		System.out.println(result[i]);
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java Program39_SavethePrisoner
2
7 19 2
3 7 3
6
3
*/