import java.io.*;
import java.util.*;
class Program46_SherlockandSquares
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int matrix[][]=new int[count][2];
		for(int i=0;i<count;i++)
		{
			matrix[i][0]=scan.nextInt();
			matrix[i][1]=scan.nextInt();
			
		}
		//int sqrtcount[][]=new int[count][1];
		int prftsqrcount=0;
		//checking whether the given range is a perfect square..
		for(int i=0;i<count;i++)
		{
			int start1=matrix[i][0];
			int end=matrix[i][1];
			
			
					int start=(int)Math.sqrt(start1);
					end=(int)Math.sqrt(end);
			
			prftsqrcount=end-start;
		
				prftsqrcount+=(Math.pow(start,2)>=start1)?1:0;
			
			start=0;
			end=0;
			System.out.println(prftsqrcount);
			prftsqrcount=0;
		}
	
	}
}