import java.io.*;
import java.util.*;
class Program51_ACMICPCTeam
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		byte arr[][]=new byte[n][m];
		for(int i=0;i<n;i++)
		{
			String str=scan.next();
			char ch[]=str.toCharArray();
			for(int j=0;j<m;j++)
			{
				arr[i][j]=(byte)(ch[j]-'0');
			}
		}
		int count1=0,count=0,nodes=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=0;k<m;k++)
				{
					if(arr[i][k]==1 || arr[j][k]==1)
					{
						count++;
					}
				}
				if(count1<count)
				{
					count1=count;
					nodes=1;
				}
				else if(count==count1)
				{
					nodes++;
				}
				count=0;
			}
		}
		System.out.println(count1);
		System.out.println(nodes);
	}
}