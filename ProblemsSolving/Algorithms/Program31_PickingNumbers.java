import java.io.*;
import java.util.*;
class Program31_PickingNumbers
{
	public static int pickingNumber(int arr[],int count)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<count;i++)
		{
			int num=arr[i];
			if(hm.containsKey(num))
			{
				hm.put(num,hm.get(num)+1);
			}
			else
			{
				hm.put(num,1);
			}
		}
		int absolutelement=Integer.MIN_VALUE;
		for(int i:hm.keySet())
		{
			int left=(hm.containsKey(i-1))?hm.get(i)+hm.get(i-1):hm.get(i);
			int right=(hm.containsKey(i+1))?hm.get(i)+hm.get(i+1):hm.get(i);
			if(absolutelement<left)
			{
				absolutelement=left;
			}
			if(absolutelement<right)
			{
				absolutelement=right;
			}
		}
		return absolutelement;
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
		int maxelement=pickingNumber(arr,count);
		System.out.println(maxelement);
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>javac Program31_PickingNumbers.java

D:\GitHub\HackerRank\ProblemSolving>java Program31_PickingNumbers
6
4 6 5 3 3 1
3

*/