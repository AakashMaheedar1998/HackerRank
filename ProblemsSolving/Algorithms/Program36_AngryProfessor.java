import java.io.*;
import java.util.*;
class Program36_AngryProfessor
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int cases=scan.nextInt();
		int student[][]=new int[cases][1000];
		int threshold[]=new int[cases];
		int stduentcount[]=new int[1000];
		for(int i=0;i<cases;i++)
		{
			stduentcount[i]=scan.nextInt();
			threshold[i]=scan.nextInt();
			for(int j=0;j<stduentcount[i];j++)
			{
				student[i][j]=scan.nextInt();
			}
			
		}
		int studentinClass=0,j=0;
		for(int i=0;i<cases;i++)
		{
			int stud=stduentcount[i];
			int thresh=threshold[i];
			for(j=0;j<stud;j++)
			{
				if(student[i][j]<=0)
				{
					studentinClass++;
				}
			}
			if(studentinClass>=thresh)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
			thresh=0;
			studentinClass=0;
			stud=0;
		}
	}
}
/*OUTPUT:
:\GitHub\HackerRank\ProblemSolving>javac Program36_AngryProfessor.java

D:\GitHub\HackerRank\ProblemSolving>java Program36_AngryProfessor
2
4 3
-1 -3 4 2
4 2
0 -1 2 1
YES
NO

D:\GitHub\HackerRank\ProblemSolving>java Program36_AngryProfessor
1
6 4
-1 -1 0 0 1 1
NO
*/