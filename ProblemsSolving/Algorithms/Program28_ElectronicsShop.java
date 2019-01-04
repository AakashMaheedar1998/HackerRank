import java.io.*;
import java.util.*;
class Program28_ElectronicsShop
{
	public static void MonicaCanBuy(int keyboard[],int usb[],int keyboardC,int usbC,int b)
	{
		int min=-1;
		int sum=0;
		
		for(int i=0;i<keyboardC;i++)
		{
			for(int j=0;j<usbC;j++)
			{
				sum=keyboard[i]+usb[j];
				if(min<sum&&sum<=b)
				{
					min =sum;
				}
				
			}
		}
		if(min<0)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(min);
		}
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int b=scan.nextInt();
		int keyboardC=scan.nextInt();
		int usbC=scan.nextInt();
		int keyboard[]=new int[keyboardC];
		int usb[]=new int[usbC];
		for(int i=0;i<keyboardC;i++)
		{
			keyboard[i]=scan.nextInt();
		}
		for(int i=0;i<usbC;i++)
		{
			usb[i]=scan.nextInt();
		}
		MonicaCanBuy(keyboard,usb,keyboardC,usbC,b);
	}
}
/*
OUTPUT:
D:\GitHub\HackerRank\ProblemSolving>javac Program28_ElectronicsShop.java

D:\GitHub\HackerRank\ProblemSolving>java Program28_ElectronicsShop
10 2 3
3 1
5 2 8
9

D:\GitHub\HackerRank\ProblemSolving>java Program28_ElectronicsShop
5 1 1
4 5
-1
*/