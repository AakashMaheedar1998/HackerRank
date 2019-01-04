import java.io.*;
import java.util.*;
class Program12_RunningTimeofAlgorithms
{
	public static int InsertionSort(int arr[],int count)
	{
		int step=0;
		for(int i=1;i<count;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
				step++;
			}
			arr[j+1]=key;
		}
		return step;
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
		int step=InsertionSort(arr,count);
		System.out.println(step);
	}
	
}