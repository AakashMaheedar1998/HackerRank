import java.io.*;
import java.util.*;
class Program37_BeautifulDaysattheMovies
{
	public static int reverse(int number)
	{
		int num=number;
		int q=0;
		while(num>0)
		{
			int r=num%10;
			
			num=(num-r)/10;
			q=10*q+r;
			
		}
		return q;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int startingnumber=scan.nextInt();
		int endingnumber=scan.nextInt();
		int dividingnumber=scan.nextInt();
		int beatifuldays=0;
		for(int i=startingnumber;i<=endingnumber;i++)
		{
			int numberrev=reverse(i);
			if(Math.abs(i-numberrev)%dividingnumber==0)
			{
				beatifuldays++;
			}
			
		}
		System.out.println(beatifuldays);
	}
}