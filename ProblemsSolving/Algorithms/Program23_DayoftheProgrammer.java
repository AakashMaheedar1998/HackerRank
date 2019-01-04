import java.io.*;
import java.util.*;
class Program23_DayoftheProgrammer
{
	public static String DayOfProgrammer(int year)
	{
	
    if (year == 1918)
	{ return "26.09.1918";
    }
	else if((year <= 1917) && (year%4 == 0) || (year > 1918) && (year%400 == 0 || ((year%4 == 0) && (year%100 != 0))))
    {    return "12.09."+year;
    }
	else
	{ 
	return "13.09."+year;
	}
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		String result=DayOfProgrammer(year);
		System.out.println(result);
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>javac Program23_DayoftheProgrammer.java

D:\GitHub\HackerRank\ProblemSolving>java Program23_DayoftheProgrammer
2017
13.09.2017

D:\GitHub\HackerRank\ProblemSolving>java Program23_DayoftheProgrammer
1984
12.09.1984

D:\GitHub\HackerRank\ProblemSolving>java Program23_DayoftheProgrammer
1918
26.09.1918

D:\GitHub\HackerRank\ProblemSolving>java Program23_DayoftheProgrammer
1701
13.09.1701
*/