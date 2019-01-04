import java.io.*;
import java.util.*;
class Program21_DivisibleSumPairs
{
	public static int Count(int arr[],int k,int count)
	{
		int result=0;
		int j,i,sum=0;
		for(i=0;i<count;i++)
		{
			j=i+1;
			while(j<count)
			{
				sum=arr[i]+arr[j];
				if(sum%k==0)
					result++;
				sum=0;
				j++;
			}
			j=i+1;
		}
		return result;
	}
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	int count=scan.nextInt();
	int k=scan.nextInt();
	int arr[]=new int[count];
	for(int i=0;i<count;i++)
	{
			arr[i]=scan.nextInt();
	}
	int result=Count(arr,k,count);
	System.out.println(result);
	}
}