import java.io.*;
import java.util.*;
class Program14_CountingSort1
{
	public static void Countingsort(int arr[],int count)
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<count;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		//create an result array as same size of arr
		int result[]=new int[count];
		//create a counting array..
		int countarr[]=new int[max+1];
		for(int i=0;i<countarr.length;i++)
		{
			countarr[i]=0;
		}
		for(int i=0;i<count;i++)
		{
			countarr[arr[i]]++;
		}
		for(int i=0;i<countarr.length;i++)
		{
			System.out.print(countarr[i]+" ");
		}
		System.out.println("");
		
	
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
		Countingsort(arr,count);
		
	}
}