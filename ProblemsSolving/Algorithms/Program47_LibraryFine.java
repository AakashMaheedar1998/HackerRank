import java.io.*;
import java.util.*;
class Program47_LibraryFine
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int d1,m1,y1,d2,m2,y2;
		d1=scan.nextInt();
		m1=scan.nextInt();
		y1=scan.nextInt();
		d2=scan.nextInt();
		m2=scan.nextInt();
		y2=scan.nextInt();
		long dueamt=0;
		if(y1==y2)
		{
			if((m2-m1)<0)
			{
				dueamt=(m1-m2)*500;
			}
			else if(m1<m2)
			{
				dueamt=0;
			}
			else
			{
			
					dueamt=(d2-d1)<0?((d1-d2)*15):0;
				
			}
		}
		else if(y2>y1)
		{
			dueamt=0;
		}
		else
		{
			dueamt=10000;
		}
		System.out.println(dueamt);
	}
	
}
