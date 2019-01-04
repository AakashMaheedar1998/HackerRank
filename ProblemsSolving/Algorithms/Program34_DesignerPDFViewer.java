import java.io.*;
import java.util.*;
class Program34_DesignerPDFViewer
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int alphabet[]=new int[26];
		for(int i=0;i<26;i++)
		{
			alphabet[i]=scan.nextInt();
		}
		String str=scan.next();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<str.length();i++)
		{
		char c=str.charAt(i);
		int n1=Integer.valueOf(c)-97;
		
		if(max<alphabet[n1])
		{
			max=alphabet[n1];
		}
			
		}
		System.out.println(max*str.length());
		
	}
	
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java Program34_DesignerPDFViewer
1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc
9

D:\GitHub\HackerRank\ProblemSolving>java Program34_DesignerPDFViewer
1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
zaba
28
*/