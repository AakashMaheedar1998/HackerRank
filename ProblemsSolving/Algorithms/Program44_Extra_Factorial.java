/*
BigInteger class for very big integer calculations
	initialization
	a=BigInteger.valueOf(25)
	or
	a=BigInteger("25")

*/

import java.util.*;
import java.io.*;
import java.math.*;
class Program44_Extra_Factorial
{
	public static void factorial(int i)
	{
		BigInteger f=BigInteger.valueOf(1);
		for(int j=2;j<=i;j++)
		{
			BigInteger fact=new BigInteger(String.valueOf(j));
			f=f.multiply(fact);
		}
	System.out.println(f);	
	}
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	int l=scan.nextInt();
	factorial(l);
	
	}
}
/*
D:\GitHub\HackerRank\ProblemSolving>java Program44_Extra_Factorial
25
15511210043330985984000000

D:\GitHub\HackerRank\ProblemSolving>javac Program44_Extra_Factorial.java

D:\GitHub\HackerRank\ProblemSolving>java Program44_Extra_Factorial
25
15511210043330985984000000

D:\GitHub\HackerRank\ProblemSolving>java Program44_Extra_Factorial
1
1

D:\GitHub\HackerRank\ProblemSolving>java Program44_Extra_Factorial
5
120

D:\GitHub\HackerRank\ProblemSolving>java Program44_Extra_Factorial
120
6689502913449127057588118054090372586752746333138029810295671352301633557244962989366874165271984981308157637893214090552534408589408121859898481114389650005964960521256960000000000000000000000000000

D:\GitHub\HackerRank\ProblemSolving>java Program44_Extra_Factorial
45
119622220865480194561963161495657715064383733760000000000

*/