import java.io.*;
import java.util.*;
class Program29_CatsandaMouse
{
	public static String[] CatAndMouse(int lines[][],int Query)
	{
		int A,B,C;
		A=B=C=0;
		
		String result[]=new String[Query];
		int diffA=-1,diffB=-1,diffC=-1;
		for(int i=0;i<Query;i++)
		{
				A=lines[i][0];
				B=lines[i][1];
				C=lines[i][2];
				diffA=(A>C?(A-C):(C-A));
				diffB=(B>C?(B-C):(C-B));
				if(diffA<diffB)
				{
					result[i]="Cat A";
				}
				else if(diffB<diffA)
				{
					result[i]="Cat B";
				}
				else
				{
					result[i]="Mouse C";
				}
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int Query=scan.nextInt();
		int lines[][]=new int[Query][3];
		for(int i=0;i<Query;i++)
		{	
			for(int j=0;j<3;j++)
			{
				lines[i][j]=scan.nextInt();
			}
		}
		String result[]=new String[Query];
		result=CatAndMouse(lines,Query);
		
		for(int i=0;i<Query;i++)
		{
			System.out.println(result[i]);
		}
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>javac Program29_CatsandaMouse.java

D:\GitHub\HackerRank\ProblemSolving>java Program29_CatsandaMouse
2
1 2 3
1 3 2
Cat B
Mouse C
*/