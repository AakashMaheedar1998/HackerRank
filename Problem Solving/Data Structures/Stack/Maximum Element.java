import java.io.*;
import java.util.*;

class Solution
{
	
	public static void main(String args[])
	{
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			Stack<Integer> stack=new Stack<Integer>();
			Stack<Integer> maxstack=new Stack<Integer>();
			for(int i=0;i<n;i++)
			{
				
				int a=scan.nextInt();
				if(a==1)
				{
					int b=scan.nextInt();
					stack.push(b);
					if(maxstack.isEmpty() || b >=maxstack.peek())
					{
						maxstack.push(b);
					}
				}	
				else if(a==2)
				{
					int popped=stack.pop();
					if(popped==maxstack.peek())
						maxstack.pop();
				}
				else if(a==3)
				{
					System.out.println(maxstack.peek());
				}
					
			}
	}
}