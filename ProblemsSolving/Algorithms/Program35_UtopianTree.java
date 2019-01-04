import java.io.*;
import java.util.*;
class Program35_UtopianTree
{
	public static void treegrowth(int tree[],int sets)
	{
		int x=1;
		int n=0;
		for(int i=0;i<sets;i++)
		{
			n=tree[i];
				if(n%2==0)
				{
					n=n/2;
					n=n+1;
					n=(int)Math.pow(2,n)-1;
					System.out.println(n);
				}
				else
				{
					int val=(n-1)/2;
					val=val+2;
					n=(int)Math.pow(2,val)-2;
					System.out.println(n);
				}
		}
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int sets=scan.nextInt();
		int tree[]=new int[sets];
		for(int i=0;i<sets;i++)
		{
			tree[i]=scan.nextInt();
		}
		treegrowth(tree,sets);
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java Program35_UtopianTree
2
4
3
7
6

D:\GitHub\HackerRank\ProblemSolving>java Program35_UtopianTree
3
0
1
4
1
2
7
*/