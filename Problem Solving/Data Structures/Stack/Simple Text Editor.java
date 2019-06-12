import java.io.*;
import java.util.*;
class Solution
{
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s="";
		String input="";
		int d;
		char c;
		Stack<String> stack=new Stack<String>();
		stack.push(s);
		for(int i=0;i<n;i++)
		{
			int ch=scan.nextInt();
			switch(ch)
			{
				case 1:
						input=scan.next();
						s=s+input;
						stack.push(s);
				break;
				case 2:
						d=scan.nextInt();
						int slen=s.length();
						String newstring="";
						if(slen-d<=0)
						{
							s=newstring;
						}
						newstring=s.substring(0,(slen-k));
	
						s=newstring;
						stack.push(s);
				break;		
				case 3:
						d=scan.nextInt();
						c=s.charAt(d-1);
						System.out.println(c);
				break;	
				case 4:	
						stack.pop();
						s=stack.peek();
						//System.out.print(s);
				break;		
				
			}
		}
	}
}