import java.io.*;
import java.util.*;
class Program07_Staircase
{
	public static void staircase(int count)
	{
		for(int i=0;i<count;i++)
		{
			for(int space=0;space<count-i-1;space++)
			{
				System.out.print(" ");
			}
			for(int j=count-i-1;j<count;j++)
			{
				System.out.print("#");
			}
			System.out.println(" ");
		}
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		staircase(count);
	}
}
/*
D:\GitHub\HackerRank\ProblemSolving>java Staircase
6
     #
    ##
   ###
  ####
 #####
######

*/