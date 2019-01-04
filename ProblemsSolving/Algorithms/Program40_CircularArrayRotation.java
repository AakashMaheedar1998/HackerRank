import java.io.*;
import java.util.*;
class Program40_CircularArrayRotation
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	int arrcount=scan.nextInt();
	int rotation=scan.nextInt()%arrcount; //for every n rotation same array..
	int index=scan.nextInt();
	int array[]=new int[arrcount];
	for(int i=0;i<arrcount;i++)
	{
		array[i]=scan.nextInt();
	}
	int location[]=new int[index];
	for(int i=0;i<index;i++)
	{
		int m=scan.nextInt();
		if(m-rotation>=0)
		{
			System.out.println(array[m-rotation]);
		}
		else
		{
			System.out.println(array[arrcount+m-rotation]);
			
		}
	}
	}
}