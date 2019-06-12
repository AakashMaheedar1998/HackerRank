import java.io.*;
import java.util.*;
import java.math.*;
class Solution
{
	public static int[] reverse(int arr[])
	{
		int low=0;
		int high=arr.length-1;
		while(low<high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		return arr;
	}
	public static int count(int arr[])
	{
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count+=arr[i];
		}
		return count;
	}	
	public static int equalStacks(int arrA[],int arrB[],int arrC[])
	{
		int count1=count(arrA);
		int count2=count(arrB);
		int count3=count(arrC);
		
		int arrAL=arrA.length;
		int arrBL=arrB.length;
		int arrCL=arrC.length;
		arrA=reverse(arrA);
		arrB=reverse(arrB);
		arrC=reverse(arrC);
		Stack<Integer> stack1=new Stack<Integer>();
		Stack<Integer> stack2=new Stack<Integer>();
		Stack<Integer> stack3=new Stack<Integer>();
		for(int i=0;i<arrAL;i++)
		{
			stack1.push(arrA[i]);
		}
		for(int i=0;i<arrBL;i++)
		{
			stack2.push(arrB[i]);
		}
		for(int i=0;i<arrCL;i++)
		{
			stack3.push(arrC[i]);
		}
		
		int min=Math.min(count1,Math.min(count2,count3));
		while(count1!= count2 || count1!=count3)
		{
			
			while(count1>min)
			{
				count1=count1-stack1.pop();
			}
			min=Math.min(count1,Math.min(count2,count3));
			while(count2>min)
			{
				count2=count2-stack2.pop();
			}
			min=Math.min(count1,Math.min(count2,count3));
			while(count3>min)
			{
				count3=count3-stack3.pop();
			}
			min=Math.min(count1,Math.min(count2,count3));
		}
		return min;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int arrA[]=new int[a];
		int arrB[]=new int[b];		
		int arrC[]=new int[c];
		for(int i=0;i<a;i++)
			arrA[i]=scan.nextInt();
		for(int i=0;i<b;i++)
			arrB[i]=scan.nextInt();
		for(int i=0;i<c;i++)
			arrC[i]=scan.nextInt();
		 int result = equalStacks(arrA, arrB, arrC);	
		System.out.println(result);
	 }
}