import java.io.*;
import java.util.*;
class Program11_Correctness_andThe_Loop_Invariant
{
	public static void InsertionSort(int arr[],int count)
	{
			for(int i=1;i<count;i++)
			{
				int key=arr[i];
				int j=i-1;
				while(j>=0&&arr[j]>key)
				{
					arr[j+1]=arr[j];
					j=j-1;
				}
				arr[j+1]=key;
			}
			
	}
	public static void print(int arr[],int count)
	{
		for(int i=0;i<count;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int arr[]=new int[count];
		for(int i=0;i<count;i++)
		{
			arr[i]=scan.nextInt();
		}
		InsertionSort(arr,count);
		print(arr,count);
	}
	
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java Program11_Correctness_andThe_Loop_Invariant
6
7 4 3 5 6 2
2 3 4 5 6 7
*/