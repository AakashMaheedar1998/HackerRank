import java.io.*;
import java.util.*;
import java.time.LocalDate;
class Solution
{
	public static String finddate(int mm,int dd,int yy)
	{
		LocalDate date=LocalDate.of(yy,mm,dd);
		return date.getDayOfWeek().toString();
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();   //MM DD YY format
		
		String d[]=input.split("\\s");
		int mm,dd,yy;
		
		mm=Integer.parseInt(d[0]);   //converts string to integer
		dd=Integer.parseInt(d[1]);
		yy=Integer.parseInt(d[2]);
		String res=finddate(mm,dd,yy);
		System.out.println(res);
	}
}