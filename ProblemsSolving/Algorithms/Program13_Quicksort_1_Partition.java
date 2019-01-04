import java.io.*;
import java.util.*;
class Program13_Quicksort_1_Partition
{
	public static int Partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=-1;
		for(int j=0;j<high;j++)
		{
			if(arr[j]<pivot)
			{
			i++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=pivot;
		arr[high]=temp;
		return i+1;
	}
	public static int[] QuickSort(int arr[],int low,int high)
	{
		if(low>high)
		{
			return arr;
		}
		int mid=Partition(arr,low,high);
		QuickSort(arr,low,mid-1);
		QuickSort(arr,mid+1,high);
		return arr;
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
		arr=QuickSort(arr,0,count-1);
		for(int i=0;i<count;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
	}
}