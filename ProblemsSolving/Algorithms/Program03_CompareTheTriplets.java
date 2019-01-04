import java.io.*;
import java.util.*;
class Program03_CompareTheTriplets
{
	public static int[] compareTheTriplets(int arr1[],int arr2[])
	{
		int result[]=new int[2];
		for(int i=0;i<2;i++)
		{
				result[i]=0;
		}
		int count1,count2;
		count1=count2=0;
		for(int i=0;i<3;i++)
		{
			if(arr1[i]>arr2[i])
				{count1++;}
			else if(arr1[i]<arr2[i])
				{count2++;}
			else
				{  }
		}
		result[0]=count1;
		result[1]=count2;
		return result;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int i,n=3;
		int arr1[]=new int[3];
		int arr2[]=new int[3];
		//input the 1starray element 
		for(i=0;i<n;i++)
			arr1[i]=scan.nextInt();
		//input the 2ndarray element 
		for(i=0;i<n;i++)
			arr2[i]=scan.nextInt();
		int arr3[]=new int[2];
		arr3=compareTheTriplets(arr1,arr2);
		for(i=0;i<arr3.length;i++)
			System.out.print(arr3[i]+" ");
		System.out.println(" ");	
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java CompareTheTriplets
1 2 3
3 2 1
1 1
*/