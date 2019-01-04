import java.io.*;
import java.util.*;
class Program45_AppendAndDelete
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String t=scan.nextLine();
		int k=scan.nextInt();
		int s_len=s.length();
		int t_len=t.length();
		int min=(s_len<t_len?s_len:t_len);
		int matchingChar=0;
		
		for(int i=0;i<min;i++)
		{
			if(s.charAt(i)==t.charAt(i))
			{
			matchingChar++;
			}
			else
				break;
		}
		int tot_length=s_len+t_len;
		if((tot_length-2*matchingChar)>k)
		{
			System.out.println("No");
			
		}
		else if(((tot_length-2*matchingChar)%2)==k%2)
		{
			System.out.println("Yes");
		}
		else if(tot_length-k<0)
		{
				System.out.println("Yes");
		}
		else
		{
			
			System.out.println("No");
		}
	
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java Program45_AppendAndDelete
hackerhappy
hackerrank
9
Yes

D:\GitHub\HackerRank\ProblemSolving>java Program45_AppendAndDelete
aba
aba
7
Yes

D:\GitHub\HackerRank\ProblemSolving>java Program45_AppendAndDelete
ashley
ash
2
No
*/