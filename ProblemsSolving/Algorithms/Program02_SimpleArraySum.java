import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class  Program02_SimpleArraySum{

    static int simpleArraySum(int[] ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
		}
		return sum;
    }

   public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int arCount=scan.nextInt();
		int ar[]=new int[arCount];
		for(int i=0;i<arCount;i++)
		{
			ar[i]=scan.nextInt();
		}

        int result = simpleArraySum(ar);
		System.out.println(result);
    }
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>java SimpleArraySum
5
1 2 3 4 5
15
*/