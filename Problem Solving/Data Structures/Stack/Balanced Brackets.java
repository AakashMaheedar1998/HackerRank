import java.io.*;
import java.util.*;
class Solution
{
    public static String balencedBracket(String str)
    {
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            
            char s1=str.charAt(i);
           
            if(s1=='(' || s1=='{' || s1=='[' )
                {
                    
                    stack.push(s1);
                }    
            else if( s1==')' || s1=='}' || s1==']' )
            {
                    if(stack.isEmpty())
						return "NO";
					else if(s1==')' && stack.peek()=='(')
                        stack.pop();
                    else if(s1=='}' && stack.peek()=='{')
                        stack.pop();
                    else if(s1==']' && stack.peek()=='[')
                        stack.pop();
                    else 
                        return "NO";

            }
        }
        if(stack.isEmpty())
        {
            return "YES";
        }
        return "NO";
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            String input=scan.next();
            System.out.println(balencedBracket(input));
        }
    }
}