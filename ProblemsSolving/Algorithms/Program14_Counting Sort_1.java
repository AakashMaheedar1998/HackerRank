import java.io.*;
import java.util.*;
class Program14_CountingSort_1
{
	public static void Countingsort(int arr,int count)
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<count;i++)
		{
			if(min>arr[i])
			{
				min=arr[i]
			}
			else if(max<arr[i])
			{
				max=arr[i];
			}
		}
		//create an result array as same size of arr
		int result[]=new int[count];
		//create a counting array..
		int countarr[]=new int[max-min];
		for(int i=0;i<count;i++)
		{
			count[arr[i]-min]=arr[i];
		}
		count[0]--;
		for(int i=1;i<countarr.length;i++)
		{
			countarr[i]=countarr[i]+countarr[i-1];
			
		}
		for(int i=count-1;i>=0;i--)
		{
			result[count[arr[i]-min]--]=arr[i];
		}
		return result;
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
		arr=Countingsort(arr,count);
		for(int i=0;i<count;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
}