import java.io.*;
import java.util.*;
class Program05_DiagonalDifference
{
	public static int diagonalDifference(int arr[][],int count)
	{
		int i,j,sum1,sum2;
		i=j=sum1=sum2=0;
		while(i<count&&j<count)
		{
			sum1+=arr[i][j];
			i++;
			j++;
		}
		i=0;
		j=count-1;
		while(i<count&&j>=0)
		{
			sum2+=arr[i][j];
			i++;
			j--;
		}
		int result=(sum1>sum2?(sum1-sum2):(sum2-sum1));
		return result;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int arr[][]=new int [count][count];
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<count;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		int result=diagonalDifference(arr,count);
		System.out.println(result);
	}
}
/*
OUTPUT
D:\GitHub\HackerRank\ProblemSolving>javac DiagonalDifference.java

D:\GitHub\HackerRank\ProblemSolving>java DiagonalDifference
3
1 2 3
3 2 1
4 5 6
0

D:\GitHub\HackerRank\ProblemSolving>java DiagonalDifference
3
1 2 3
4 5 6
9 8 9
2
*/
