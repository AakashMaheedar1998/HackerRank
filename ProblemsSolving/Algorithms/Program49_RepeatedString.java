import java.io.*;
import java.util.*;
class Program49_RepeatedString
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int charcount=scan.nextInt();
		int strlen=str.length();
		int times=0;
		if(strlen<charcount)
		{
			times=(int)Math.ceil(charcount/strlen);
		}
		int exact=(int)Math.floor(charcount/strlen);
		System.out.println(times);
		
		System.out.println(exact);
		String infintestr="";
		for(int i=0;i<=times;i++)
		{
			infintestr+=str;
			
		}
		System.out.println(infintestr);
		char ch[]=infintestr.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
		int count=0;
		for(int i=0;i<charcount;i++)
		{
			if(ch[i]=='a')
				count++;
		}
		System.out.println(count);
	}
}