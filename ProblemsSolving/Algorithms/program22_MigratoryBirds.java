import java.io.*;
import java.util.*;
class program22_MigratoryBirds
{
	public static int Migratory_Birds(int arr[],int count)
	{
		Arrays.sort(arr);
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(Integer i:arr)
		{
			if(hm.containsKey(i))
			{
				hm.put(i,hm.get(i)+1);
			}
			else
			{
				hm.put(i,1);
			}
		}
		int min=0,value=0;
		for(int i=0;i<count;i++)
		{
			int n=arr[i];
			if(hm.get(n)>min)
			{
				min=hm.get(n);
				value=n;
			}
		}
		return value;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int arr1[]=new int[count];
		for(int i=0;i<count;i++)
		{
			arr1[i]=scan.nextInt();
		}
		int maxVisit=Migratory_Birds(arr1,count);
		System.out.println(maxVisit);
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java program22_MigratoryBirds
6
1 4 4 4 5 3
4

D:\GitHub\HackerRank\ProblemSolving>java program22_MigratoryBirds
6
1 2 2 3 3 4
2

*/