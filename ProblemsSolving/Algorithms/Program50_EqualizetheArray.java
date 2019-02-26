import java.io.*;
import java.util.*;
class Program50_EqualizetheArray
{
	 public static int equalizeArray(int[] c)
	{
		int count=c.length;
		int jumps=0;
		Arrays.sort(c);
		int count1=1,count2=0;
		for(int i=0;i<count;i++)
		{
			if( (i+1) < count && c[i]==c[i+1])
			{
				count1=count1+1;
			}
			else
			{
				count1=1;
			}
			if(count2<count1)
				count2=count1;
		}
		return (count-count2);
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
		int jumps=equalizeArray(arr);
		System.out.println(jumps);
	}
}