import java.io.*;
import java.util.*;
class Program26_DrawingBook
{
	public static int no_of_turns(int count,int page)
	{
		int beg=page/2;
		int end=0;
		if(count%2==1)
		{
			end=(count-page)/2;
		}
		else
		{
			end=(int)Math.ceil((count-page)/2);
		}
		return (beg<end?beg:end);
	}
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	int count=scan.nextInt();
	int page=scan.nextInt();
	int turns=no_of_turns(count,page);
	System.out.println(turns);
	}
}