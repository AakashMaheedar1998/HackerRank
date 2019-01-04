import java.io.*;
import java.util.*;
class Program10_TimeConversion
{
	public static String TimeConversion(String time)
	{
		String array[]=time.split(":");
		String hrs=array[0];
		String min=array[1];
		String sec=array[2].substring(0,2);
		int temp;
		if(array[2].substring(2,4).equalsIgnoreCase("PM"))
		{
			if(Integer.parseInt(hrs)<12)
			{
				temp=Integer.parseInt(hrs);
				temp+=12;
				hrs=Integer.toString(temp);
			}
			
		}
		if(array[2].substring(2,4).equalsIgnoreCase("AM"))
		{
			if(Integer.parseInt(hrs)==12)
			{
				hrs="00";
			}
		}
	return (hrs+":"+min+":"+sec);
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String time=scan.next();
		String ltime=TimeConversion(time);
		System.out.println(ltime);
	}
}