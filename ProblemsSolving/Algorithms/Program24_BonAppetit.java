import java.io.*;
import java.util.*;
class Program24_BonAppetit
{
	public static String BonAppetit(int bill[],int a,int b)
	{
		int sum=0;
		for(int i=0;i<bill.length;i++)
		{
			if(i!=a)
				sum+=bill[i];
				
		}
		sum=sum/2;
		if(sum==b)
		{
			return "Bon Appetit";
		}
		else
			return b-sum+" ";
		
	}
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	int count=scan.nextInt();
	int annadecline=scan.nextInt();
	int bill[]=new int[count];
	for(int i=0;i<count;i++)
	{
		bill[i]=scan.nextInt();
	}
	int Brainscalcualtion=scan.nextInt();
	String result=BonAppetit(bill,annadecline,Brainscalcualtion);
	System.out.println(result);

	}
}