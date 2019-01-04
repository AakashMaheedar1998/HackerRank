import java.io.*;
import java.util.*;
class Program30_FormingaMagicSquare
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int Possible[][][]={{{8,1,6},{3,5,7},{4,9,2}},
							{{6,1,8},{7,5,3},{2,9,4}},
							{{4,9,2},{3,5,7},{8,1,6}},
							{{2,9,4},{7,5,3},{6,1,8}},
							{{8,3,4},{1,5,9},{6,7,2}},
							{{4,3,8},{9,5,1},{2,7,6}},
							{{6,7,2},{1,5,9},{8,3,4}},
							{{2,7,6},{9,5,1},{4,3,8}},
						};
		int ipmatrix[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				ipmatrix[i][j]=scan.nextInt();
				
			}
		}
		int mini=Integer.MAX_VALUE;
		for(int k=0;k<8;k++)
		{
			int diffval=0;
				for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
						diffval+=Math.abs(ipmatrix[i][j]-Possible[k][i][j]);
				}
				
			}
			mini=Math.min(diffval,mini);
		}
		System.out.println(mini);				
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java Program30_FormingaMagicSquare
5 3 4
1 5 8
6 4 2
7

*/