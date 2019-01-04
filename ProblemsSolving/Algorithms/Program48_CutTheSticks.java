import java.io.*;
import java.util.*;
class Program48_CutTheSticks
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int arr[]=new int[count];
		
		for(int i=0;i<count;i++)
		{
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		int small=arr[0];
		int curr=arr[0];
		int arrcnt=0;
		int N=count;
		System.out.println(N);
		for(int i=0;i<count;i++)
		{
			if(arr[i]==curr)
			{
				arrcnt++;
			}
			else
			{
				N=N-arrcnt;
				arrcnt=1;
				curr=arr[i];
				System.out.println(N);
			}
		}
	}
}